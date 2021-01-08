package net.slipp.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.slipp.domain.Answer;
import net.slipp.domain.AnswerRepository;
import net.slipp.domain.Question;
import net.slipp.domain.QuestionRepository;
import net.slipp.domain.Result;
import net.slipp.domain.User;

@Controller
@RequestMapping("/answers")
public class AnswerController {
	@Autowired
	private AnswerRepository answerRepository;
	@Autowired
	private QuestionRepository questionRepository;
	
	@GetMapping("/{id}/form/questions/{questionId}")
	public String answerUpdateForm(@PathVariable Long id, @PathVariable Long questionId, Model model, HttpSession session) {
		Answer answer = answerRepository.findById(id).get();
		Question question = questionRepository.findById(questionId).get();
		Result result = valid(session, answer);
		if(!result.isValid()) {
			model.addAttribute("errorMessage", result.getErrorMessage());
			return "/user/login";
		}
		model.addAttribute("question", question);
		model.addAttribute("answer", answer);
		return "/qna/answerUpdateForm";
	}
	
	@PutMapping("/{id}/questions/{questionId}")
	public String update(@PathVariable Long id, @PathVariable Long questionId, String contents, Model model, HttpSession session) {
		Answer answer = answerRepository.findById(id).get();
		Result result = valid(session, answer);
		if(!result.isValid()) {
			model.addAttribute("errorMessage", result.getErrorMessage());
			return "/user/login";
		}
		answer.update(contents);
		answerRepository.save(answer);
		return String.format("redirect:/questions/%d", questionId);
	}
	
	private Result valid(HttpSession session, Answer answer) {
		if(!HttpSessionUtils.isLoginUser(session)) {
			return Result.fail("로그인이 필요합니다");
		}
		User loginUser = HttpSessionUtils.getUserFromSession(session);
		if(!answer.isSameWriter(loginUser)) {
			return Result.fail("자신이 쓴 의견만 수정, 삭제가 가능합니다.");
		}
		return Result.ok();
	}
}

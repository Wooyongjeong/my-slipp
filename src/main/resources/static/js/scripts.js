$(".answer-write input[type=submit]").click(addAnswer);

function addAnswer(e) {
	console.log("clicked");
	e.preventDefault();

	var queryString = $(".answer-write").serialize();
	console.log("query: " + queryString);

	var url = $(".answer-write").attr("action");
	console.log(url);

	$.ajax({
		type: 'post',
		url: url,
		data: queryString,
		dataType: 'json',
		error: onError,
		success: onSuccess
	});
}

function onError() {

}

function onSuccess(data, status) {
	console.log(data);
	var answerTemplate = $("#answerTemplate").html();
	var template = answerTemplate.format(data.writer.userId, data.formattedCreateDate, data.contents, data.question.id ,data.id);
	$(".qna-comment-slipp-articles").prepend(template);
	$(".answer-write textarea").val('');
}

$(document).on('click', ".link-delete-article", deleteAnswer);
// $(".link-delete-article").click(deleteAnswer); // 이 방식의 문제점은 동적으로 생성한 html의 경우에는 onclick을 달지 못하는 거임

function deleteAnswer(e) {
	e.preventDefault();
	
	var deleteBtn = $(this);
	var url = deleteBtn.attr("href");
	console.log(url);
	
	$.ajax({
		type: 'delete',
		url: url,
		dataType: 'json',
		error: function(xhr, status) {
			console.log("error");
		},
		success: function(data, status) {
			console.log(data);
			if (data.valid) {
				deleteBtn.closest("article").remove();
			} else {
				alert(data.errorMessage);
			}
		}
	});
}

String.prototype.format = function() {
	var args = arguments;
	return this.replace(/{(\d+)}/g, function(match, number) {
		return typeof args[number] != 'undefined'
			? args[number]
			: match
			;
	});
};
# my-slipp
 박재성님의 [자바 웹 애플리케이션 과정](https://youtube.com/playlist?list=PLqaSEyuwXkSppQAjwjXZgKkjWbFoUdNXC) 강의를 따라 만든 질문-답변 게시판입니다. <br>
 `spring boot`를 이용하여 만들었고, `h2 database`를 이용하였습니다.<br>
 회원가입, 로그인, 질문 및 답변 작성, 질문과 답변 수정 및 삭제 기능을 구현하였습니다. <br>
 aws ec2 외부 서버에 웹 애플리케이션을 배포하였고, [링크](http://ec2-3-36-132-56.ap-northeast-2.compute.amazonaws.com:8080)를 통해 열어볼 수 있습니다.
![main](https://user-images.githubusercontent.com/38418028/103629654-f5517b00-4f83-11eb-87d9-ebfda3558796.png)
![join](https://user-images.githubusercontent.com/38418028/103629662-f71b3e80-4f83-11eb-8af0-d662f7b395fe.png)
![login](https://user-images.githubusercontent.com/38418028/103629667-f84c6b80-4f83-11eb-840d-89a9ce47c67e.png)
![question](https://user-images.githubusercontent.com/38418028/103629670-f97d9880-4f83-11eb-80f4-f74bf39f7f61.png)
![answer](https://user-images.githubusercontent.com/38418028/103629674-faaec580-4f83-11eb-9d63-2e1ac6478846.png)
![main_after_answer](https://user-images.githubusercontent.com/38418028/103629679-fb475c00-4f83-11eb-8fc2-815b6a97b985.png)


# 반복주기 1
## 1-1. 로컬 개발 환경 세팅
* spring boot project
    * web/mustache/dev-tools
* "Hello World" welcome 페이지
* live reload chrome extension 설치

## 1-2. bootstrap 활용한 html 페이지 개발
* bootstrap start html 추가
* bootstrap css 라이브러리 추가
* jquery javascript 라이브러리 추가
* index.html => nav bar 추가
* 회원가입 페이지 개발

## 1-3. github에 소스코드 추가
* sourcetree에 저장소 추가
* github에 소스 코드 추가
* ~~local => 개발 서버 / 실 서버~~
* local => **git/svn(버전관리시스템)** => 개발 서버/실 서버
* local => github.com => 개발 서버/실 서버

## 1-4. 원격 서버(개발 서버 또는 실 서버)에 소스 코드 배포하기 1
* ssh로 서버 접속
* 한글 인코딩 설정
* 계정 추가 및 sudo 권한 부여

## 1-5. 원격 서버(개발 서버 또는 실 서버)에 소스 코드 배포하기 2
* 자바 설치
    * wget --header "Cookie: oraclelicense=accept-securebackup-cookie" https://github.com/frekele/oracle-java/releases/download/8u212-b10/jdk-8u212-linux-x64.tar.gz
* git 설치
* git clone 후 빌드
* 서버 시작

# 반복주기 2
## 학습목표
* 동적인 HTML 웹 페이지 개발
* Spring MVC의 Model, View, Controller 기반 개발

## 2-1. Controller 추가 및 mustache에 인자 전달
## 2-2. 회원가입 기능 구현
## 2-3. 사용자 목록 기능 구현
## 2-4. 원격 서버에 소스 코드 배포
* 시작할 때 중요한건 내가 경험하고 경험한 상태까지의 나만의 용어로 내가 이해할 수 있는, 내 상상을 통해서 정리된 문구로 만들어서 이해를 하는 게 중요한거임. 틀려도 괜찮아!
* 이런 과정을 반복하다보면 서버, 클라이언트 이런 것들에 대한 나만의 이미지(처음 자바지기님이 얘기한 심적 표상이라고 한 부분)이 만들어지면서 지식이 체계화가 되는 거임.
* 다른 사람의 글이나 문구에서 체계가 되는 것이 아니라 나 스스로의 용어, 나의 경험에 의해서 만들어진 것으로 체득이 되어야 온전히 내 것이 되는 거임
## 2-5. 이전 상태로 원복 후 반복 구현

# 반복주기 3
## 학습목표
* 데이터베이스에 사용자 데이터 추가
* 개인정보 수정 기능 구현
* 질문하기, 질문목록 기능 구현

## 3-1. QnA HTML 템플릿, H2 데이터베이스 설치, 설정, 관리툴 확인
## 3-2. 자바 객체와 테이블 매핑, 회원가입 기능 구현
## 3-3. HTML 정리, URL 정리
## 3-4. 개인정보 수정 기능 구현
## 3-5. 원격 서버에 소스 코드 배포
## 연습2. vi 연습하기

# 반복주기 4
## 학습 목표
* 로그인 기능 구현을 통한 쿠키와 세션에 대한 대략적인 이해
* 로그인 사용자에 대한 접근 제한

## 4-1. 로그인 기능 구현
## 4-2. 로그인 상태에 따른 메뉴 처리 및 로그 아웃
## 4-3. 로그인 사용자에 한해 자신의 정보를 수정하도록 수정
## 4-4. 중복 제거 및 읽기 좋은 코드를 위한 리팩토링
## 4-5. 질문하기, 질문목록 기능 구현
## 4-6. 원격 서버에 소스 코드 배포
## 연습3. ATOM 에디터를 활용한 HTML 코딩

# 반복주기 5
## 학습 목표
* 객체 간의 관계 설정(@OneToMany, @ManyToOne 등)

## 5-1. 회원과 질문 간의 관계 맵핑 및 리팩토링
## 5-2. 질문 상세보기 기능 구현
## 5-3. 질문 수정 기능 구현
## 5-4. 수정/삭제 기능에 대한 보안 처리 및 LocalDateTime 설정
## 5-5. 답변 추가 및 답변 목록 기능 구현
## 5-6. QuestionController 중복 제거 리팩토링
## 5-7. 원격 서버에 소스 코드 배포
> 1. cd my-slipp
> 1. git pull
> 1. mvnw clean package
> 1. tomcat/bin/shutdown.sh
> 1. cd target
> 1. mv my-slipp-1.0 ~/tomcat/webapps/ROOT
> 1. tomcat/bin/startup.sh
* 매번 이렇게 할래..? 다음 반복주기에서 쉘 스크립트를 통해 자동화하자

# 반복주기 6
## 학습 목표
* JSON API 및 AJAX를 활용해 답변 추가/삭제 구현

## 6-1. AJAX를 활용해 답변 추가 기능 구현
## 6-2. AJAX를 활용해 답변 삭제 기능 구현
## 6-3. 질문 목록에 답변 수 보여주기 기능 추가
## 6-4. 중복 제거 및 리팩토링
## 6-5. Swagger 라이브러리를 이용하여 JSON API 추가 및 테스트
## 6-7. 쉘 스크립트를 활용한 배포 자동화
> 1. cd my-slipp
> 1. git pull
> 1. 메이븐 빌드(mvnw clean package)
> 1. tomcat 서버 종료(tomcat/bin/shutdown.sh)
> 1. tomcat/webapps/ROOT 삭제
> 1. 빌드한 프로젝트를 tomcat/webapps/ROOT로 이동 (mv my-slipp-1.0 ~/tomcat/webapps/ROOT)
> 1. tomcat 서버 시작(tomcat/bin/startup.sh)

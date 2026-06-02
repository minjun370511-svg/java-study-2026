# Computer Science & AI Study Log

세종대학교 AI데이터사이언스학과 학생으로서 AI, 데이터 분석, 백엔드 개발, 게임 개발 등 다양한 분야의 역량을 쌓기 위해 학습한 내용을 기록하는 저장소입니다.

## 📚 Study Areas

* Java
* Computer Science
* Backend Development
* Data Analysis
* Artificial Intelligence
* Game Development

---
# Day1 (2026-06-01)

## 학습 내용

### 2장
- 변수
- 기본 타입
- 형변환
- Scanner 입력

### 3장
- 산술 연산자 (+, -, *, /, %)
- 증감 연산자 (++ , --)
- 비교 연산자 (>, <, ==, !=, >=, <=)
- 논리 연산자 (&&)

---

## 실습 문제

| 문제 | 내용 | 난이도 |
|--------|--------|--------|
| Problem01 | 이름, 나이 출력 | ★ |
| Problem02 | 원의 넓이 계산 | ★ |
| Problem03 | 정수 + 실수 계산 | ★ |
| Problem04 | 학생 정보 출력 | ★ |
| Problem05 | 초를 시분초로 변환 | ★★ |
| Problem06 | 화폐 단위 계산 | ★★★ |
| Problem07 | 총점과 평균 계산 | ★★ |
| Problem08 | Scanner 입력받기 | ★★★ |
| Problem09 | 화폐 단위 분해 | ★★★★ |
| Problem10 | 증감 연산자 | ★★ |
| Problem11 | 비교 연산자 | ★★ |
| Problem12 | 논리 연산자 | ★★ |
| Problem13 | 짝수 여부 판단 | ★★★ |
| Problem14 | 두 수의 사칙연산 | ★★★ |

---

## 배운 점

### boolean 사용 (problem12)

좋은 코드
```java
boolean hasId = true;
(age > 20) && hasId; 

```
불필요한 코드
```java
 boolean hasId = true;
(age > 20) && (hasId == true);
```

### printf 사용 (problem7,8)
소수점 둘째자리까지 출력
```java
System.out.printf("%.2f", average);
```
---

## 느낀 점

Scanner를 이용한 입력 처리와 연산자 사용에 익숙해졌다.

특히 Problem08(입력받기), Problem09(화폐 단위 분해)가 가장 도움이 되었다.

앞으로는 변수명을 더 직관적으로 짓는 습관을 들이고, 조건문과 반복문을 활용한 문제 해결 능력을 키우고 싶다.
# Day2 (2026-06-02)

## 학습 내용

### 4장
- if
- if-else
- else-if
- 논리 연산자와 조건식
- for 반복문
- 중첩 for문

---

## 실습 문제

| 문제 | 내용 | 난이도 |
|--------|--------|--------|
| Problem01 | 양수/음수 판별 | ★ |
| Problem02 | 입장 가능 여부 판단 | ★★ |
| Problem03 | 학점 계산 | ★★ |
| Problem04 | 나이 요금 분류 | ★★ |
| Problem05 | 계절 판별 | ★★★ |
| Problem06 | 세 수 중 최댓값 | ★★★ |
| Problem07 | 점수 + 출석 합격 판정 | ★★★ |
| Problem08 | 1부터 N까지 출력 | ★★ |
| Problem09 | 1부터 N까지 홀수 출력 | ★★★ |
| Problem10 | 1부터 N까지 합계 | ★★★ |
| Problem11 | 별 한 줄 출력 | ★★ |
| Problem12 | 별 삼각형 출력 | ★★★★ |
| Problem13 | 역삼각형 출력 | ★★★★ |
| Problem14 | 공백 포함 삼각형 | ★★★★★ |
| Problem15 | 피라미드 출력 | ★★★★★ |

---

## 느낀 점

오늘은 조건문과 반복문을 활용한 문제를 풀면서 문법을 실제로 적용하는 연습을 했다.

특히 Problem14와 Problem15를 통해 중첩 for문과 공백, 별의 규칙을 이해할 수 있었다.

대부분의 문제를 힌트 없이 해결해서 조건문과 반복문에 익숙해졌다는 느낌을 받았다.

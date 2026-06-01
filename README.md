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
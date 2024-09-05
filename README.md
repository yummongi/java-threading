# ☕️ 김영한의 실전 자바 - 고급 1편: 멀티스레드와 동시성

이 리포지토리는 인프런에서 제공하는 김영한 님의 "실전 자바 - 고급 1편, 멀티스레드와 동시성" 강의를 학습하고 실습하는 공간입니다.

## 📚 강의 개요

- 강사: 김영한
- 플랫폼: 인프런
- 주제: Java의 멀티스레드와 동시성
- 총 강의 시간: 약 17시간 30분

## 🎯 학습 목표

- Java의 멀티스레드 개념 심도 있게 이해하기
- 동시성 프로그래밍의 고급 기법 습득하기
- 스레드 안전성 확보 방법 마스터하기
- 실제 프로젝트에 멀티스레드 및 동시성 기술 적용하기

## 📋 커리큘럼 및 학습 진행 상황

### 섹션 1: 강의 소개
- [x] 강의 소개와 자료

### 섹션 2: 프로세스와 스레드 소개
- [x] 멀티태스킹과 멀티프로세싱
- [x] 프로세스와 스레드
- [x] 스레드와 스케줄링
- [x] 컨텍스트 스위칭

### 섹션 3: 스레드 생성과 실행
- [x] 프로젝트 환경 구성
- [x] 스레드 시작 1, 2
- [x] 데몬 스레드
- [x] 스레드 생성 - Runnable
- [x] 로거 만들기
- [x] 여러 스레드 만들기
- [x] Runnable을 만드는 다양한 방법

### 섹션 4: 스레드 제어와 생명 주기 1
- [x] 스레드 기본 정보
- [x] 스레드의 생명 주기
- [x] join 메서드 활용

### 섹션 5: 스레드 제어와 생명 주기 2
- [x] 인터럽트
- [x] 프린터 예제
- [x] yield - 양보하기

### 섹션 6: 메모리 가시성
- [x] volatile과 메모리 가시성
- [x] 자바 메모리 모델(Java Memory Model)

### 섹션 7: 동기화 - synchronized
- [x] 출금 예제
- [x] 동시성 문제
- [x] 임계 영역
- [x] synchronized 메서드와 코드 블럭

### 섹션 8: 고급 동기화 - concurrent.Lock
- [x] LockSupport
- [x] ReentrantLock

### 섹션 9: 생산자 소비자 문제 1
- [x] 생산자 소비자 문제 소개 및 예제
- [x] Object - wait, notify

### 섹션 10: 생산자 소비자 문제 2
- [x] Lock Condition
- [x] BlockingQueue

### 섹션 11: CAS - 동기화와 원자적 연산
- [x] 원자적 연산
- [x] CAS 연산
- [x] CAS 락 구현

### 섹션 12: 동시성 컬렉션
- [x] 동시성 컬렉션의 필요성
- [x] 자바 동시성 컬렉션

### 섹션 13: 스레드 풀과 Executor 프레임워크 1
- [x] ExecutorService 소개 및 활용
- [x] Future 활용

### 섹션 14: 스레드 풀과 Executor 프레임워크 2
- [x] ExecutorService 우아한 종료
- [x] Executor 스레드 풀 관리 및 전략

### 섹션 15: 다음으로
- [x] 과정 정리 및 향후 학습 방향

## 💻 주요 실습 프로젝트

- [x] 멀티스레드 은행 계좌 관리 시스템
- [x] 생산자-소비자 패턴을 활용한 작업 큐 구현
- [x] ExecutorService 학습
 

## 🔗 링크

- [김영한의 실전 자바 강의 링크](https://inf.run/C2Xgs)

## ⚠️ 주의사항

이 리포지토리의 코드는 학습 목적으로 작성되었으며, 실제 프로덕션 환경에서는 추가적인 고려사항이 필요할 수 있습니다.

## 📌 Commit 메시지 규칙

학습 진행 상황을 효과적으로 추적하기 위해 다음과 같은 commit 메시지 규칙을 따릅니다:

```
[섹션번호] 주제: 상세 내용

- 학습한 주요 개념
- 실습한 내용
- 특이사항 또는 주의점
```

예시:
```
[섹션7] 동기화 - synchronized: 학습 완료

- synchronized 메서드와 블록의 차이점 학습
- 출금 예제를 통한 동시성 문제 실습
- 임계 영역 개념 이해 및 적용
```

- 일관성 있는 형식을 유지하여 나중에 쉽게 검색하고 이해할 수 있도록 합니다.
- 핵심 내용을 간단하게 요약하되, 필요한 정보는 모두 포함시킵니다.
- 진행 상황을 "학습 시작", "진행 중", "완료" 등으로 명확히 표시합니다.

## 📅 학습 일지

| 날짜         | 학습 내용              | 비고                                                            |
|------------|--------------------|---------------------------------------------------------------|
| 2024-08-24 | 리포지토리 생성 및 학습 계획 수립 | 화이팅!                                                          |
| 2024-08-24 | 섹션 1-6 완료          | 기본 멀티스레드 개념 학습 완료                                             |
| 2024-08-25 | 섹션 7 완료            | synchronized까지 학습 완료                                          |
 | 2024-08-28 | 섹션 8 완료            | concurrent.Lock 패키지 관련 학습 완료                                  |
| 2024-08-28 | 섹션 9 완료            | 생산자 소비자 문제, Object 동기화 메서드 학습 완료                              |
| 2024-08-29 | 섹션 10 완료           | Lock Condtion, BlockingQueue 등 학습 완료                          |
| 2024-08-30 | 섹션 11 완료           | 원자적 연산, CAS, CAS기반의 lock-free, atomic 패키지 학습                  |
| 2024-08-30 | 섹션 12 완료           | 동시성 컬렉션 내부 구현 원리, 성능 특성 학습, 동시성 컬렉션 특징 파악 등 학습                |
| 2024-09-01 | 섹션 13 완료           | 스레드 풀과 Execcutore 프레임워크 학습                                    |
| 2024-09-05 | 섹션 14-15 완료        | ExecutorService의 우아한 종료 방법, 스레드 풀 관리 및 전략, 스레드 풀 효율적인 사용 등 학습 |

☕️ 자바의 멀티스레드와 동시성, 한 잔의 커피처럼 깊이 있게 음미하며 배우자!
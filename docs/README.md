# 요구 사항 목록

---
## *P1*

### 환경 설정
- [x] test, local, prod 환경 분리
- [x] local mysql db 만들기
- [x] prod mysql db 만들기
- [x] 기존 test 코드 리팩터링

### 데이터베이스
- [ ] table 설계
- [ ] db에 적용

### 주문
- [ ] 주문 통합 테스트 작성
  - 성공
    - [ ] 201 - 단일 상품 주문에 성공한다.
    - [ ] 201 - 다중 상품 주문에 성공한다.
  - 실패
    - [ ] 400 - 계산 금액이 맞지 않는다.
    - [ ] 401 - 유저 인증에 실패한다.
    - [ ] 404 - 없는 cart-item id 이다.
- [ ] 주문 dao 테스트 작성
- [ ] 주문 dao 코드 작성
- [ ] 주문 service 코드 작성
- [ ] 주문 controller 코드 작성

### 주문 목록 조회
- [ ] 주문 목록 조회 통합 테스트 작성
    - 성공
        - [ ] 200 - 조회에 성공한다.
        - [ ] 200 - 주문 목록이 없다. (빈 리스트)
    - 실패
        - [ ] 401 - 유저 인증에 실패한다.
- [ ] 주문 목록 조회 dao 테스트 작성
- [ ] 주문 목록 조회 dao 코드 작성
- [ ] 주문 목록 조회 service 코드 작성
- [ ] 주문 목록 조회 controller 코드 작성

### 주문 상세 조회
- [ ] 주문 상세 조회 통합 테스트 작성
    - 성공
        - [ ] 200 - 조회에 성공한다.
    - 실패
        - [ ] 401 - 유저 인증에 실패한다.
        - [ ] 404 - 없는 order id 이다.
- [ ] 주문 상세 조회 dao 테스트 작성
- [ ] 주문 상세 조회 dao 코드 작성
- [ ] 주문 상세 조회 service 코드 작성
- [ ] 주문 상세 조회 controller 코드 작성

### 여러 상품 한 번에 조회
- [ ] 여러 상품 한 번에 조회 통합 테스트 작성
    - 성공
        - [ ] 200 - 조회에 성공한다.
    - 실패
        - [ ] 400 - 잘못된 request parameter 이다.
        - [ ] 404 - 없는 product id 이다.
- [ ] 여러 상품 한 번에 조회 dao 테스트 작성
- [ ] 여러 상품 한 번에 조회 dao 코드 작성
- [ ] 여러 상품 한 번에 조회 service 코드 작성
- [ ] 여러 상품 한 번에 조회 controller 코드 작성

---
## *P2*

### service 테스트 코드 작성
- [ ] 주문 service 테스트 코드 작성
- [ ] 주문 목록 조회 service 테스트 코드 작성
- [ ] 주문 상세 조회 service 테스트 코드 작성
- [ ] 여러 상품 한 번에 조회 service 테스트 코드 작성

### controller 테스트 코드 작성
- [ ] 주문 controller 테스트 코드 작성
- [ ] 주문 목록 조회 controller 테스트 코드 작성
- [ ] 주문 상세 조회 controller 테스트 코드 작성
- [ ] 여러 상품 한 번에 조회 controller 테스트 코드 작성

### Spring Rest Docs 작성
- [ ] 주문 docs 작성
- [ ] 주문 목록 조회 docs 작성
- [ ] 주문 상세 조회 docs 작성
- [ ] 여러 상품 한 번에 조회 docs 작성
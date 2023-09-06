# 2023-2_ObjectBackend
2학기 object 동아리 백엔드

## 1. 과제 제출하는 방법

### 방법 1
1. 해당 repository를 fork 하세요.
2. 로컬에서 작업한 커밋을 fork한 repository에 push 하세요.
5. Pull Request를 생성하여, 과제를 제출해주세요.

### 방법 2
1. 해당 repository를 clone 하세요:
```
git clone https://github.com/jucheolkang/2023-2_ObjectBackend.git
```
2. 별도의 브랜치를 생성하세요:
```
git checkout -b <새 브렌치 이름>
```
3. 과제를 작성하시고, `./{폴더이름}/{nickName}` 디렉토리 저장해주세요.

4. 해당 브랜치를 푸쉬해주세요.
```
git push -u origin <새 브렌치 이름>
```
5. Pull Request를 생성하여, 과제 제출해주세요.


## 2. git 사용 방법

### 사용자 등록
```
git config user.name “Your name”`
git config user.email "Your email address"
```

### 깃허브랑 폴더 연결하기
```
git remote add origin <깃허브 주소>
```
### 깃허브에 파일 저장하기
add -> commit -> push 순서대로 진행해 주세요
#### 파일 추가
```
git add <파일이름>
```
<파일 이름> 대신 .을 입력하면 해당 폴더 내의 모든 파일이 추가 됩니다

#### 메시지 남기기
```
git commit -m “<메시지>”
```

#### 깃허브에 파일 올리기
```
git push -u origin <브렌치 이름>
```

### 깃허브에서 파일 받아오기
```
git pull origin <브렌치 이름>
```
## 3. git 다운로드
https://git-scm.com/download/win
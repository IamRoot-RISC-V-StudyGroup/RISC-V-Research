# GIT Cheatsheet for RISC-V study members

내 저장소에 Fork된 Repository와 원본 Repository를 Sync하는 방법
사전 조건 : Merge하고 싶은 Local branch에 Checkout되어 있어야함.
```
git checkout {Local branch 이름}
```

명령어
```
git remote add {Remote 이름} {원본 Repository 주소}
git fetch {Remote 이름}
git merge {Remote 이름}/{Remote 브랜치}
```

예시
```
git remote add upstream some://where.over/the/rainbow.git
git fetch upstream
git merge upstream/master
```

마지막 Commit을 수정하는 방법
```
git commit --amend
```

Staging과 Commit Messaging을 한 방에 하는 방법
```
git commit -am "commit messages"
```

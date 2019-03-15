
git clone https://qin682@bitbucket.associatesys.local/scm/~qin682/hello.git

cd hello

git flow init

git status

# create a learn feature branch off develop branch
git flow feature start learn

# to commit locally
git flow feature finish learn
git add --all | git add -A
git commit -m "Initial Commit"

# Set this repository as your "origin" to push to
git remote set-url origin https://qin682@bitbucket.associatesys.local/scm/~qin682/hello.git

# Not available in git
git push -u origin develop | git push -u origin develop

git push -u origin --all
git push origin --tags

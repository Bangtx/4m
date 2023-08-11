# JFGA

### Install project
```
git clone https://github.com/Bangtx/4m.git
docker-compose build

docker-compose run --rm api bash
./gradlew build

rebuild project 
    - ./gradlew clean
    - ./gradlew build

docker-compose run --rm web bash
npm install
```

### run api
```
docker-compose up api
```
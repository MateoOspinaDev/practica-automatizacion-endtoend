pipeline {
    agent any
    triggers {
        pollSCM('* * * * *')
    }

    stages {
        stage('Clean') {
            steps{
                bat 'gradlew clean'
            }
        }

        stage('Build') {
            steps{
                bat 'gradlew build -x test'
            }
        }
    }
}
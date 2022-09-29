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
        stage('Test') {
            steps{
                bat 'gradlew test'
            }
        }

        stage('Serenity') {
            steps{
                bat 'gradlew aggregate'
            }
            post {
                always {
                    publishHTML target: [
                        allowMissing: false,
                        alwaysLinkToLastBuild: false,
                        keepAll: true,
                        reportName : 'Serenity Report',
                        reportDir:   'reports',
                        reportFiles: 'index.html'
                    ]
                }
            }
        }
    }
}
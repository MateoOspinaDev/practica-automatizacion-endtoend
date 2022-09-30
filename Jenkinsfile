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
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    bat 'gradlew test'
                }
            }
        }
        stage('Serenity') {
            steps{
                bat 'gradlew aggregate'
            }
        }
        stage('Publish serenity HTML report') {
            steps {
                publishHTML target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: false,
                    keepAll: true,
                    reportName : 'Serenity Report',
                    reportDir:   'target/site/serenity',
                    reportFiles: 'index.html'
                ]
            }
        }
    }
}
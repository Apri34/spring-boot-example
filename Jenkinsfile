pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {
        stage('Build') {
            steps {
                sh './gradlew war'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
    }
}
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/dee-tree/jenkins-java-junit-playground'
                sh 'chmod +x ./gradlew'
                sh './gradlew clean assemble'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
    }
    post {
        always {
            junit 'build/**/TEST-*.xml'
            junit 'custom-report/TEST-*.xml'
        }
    }
}
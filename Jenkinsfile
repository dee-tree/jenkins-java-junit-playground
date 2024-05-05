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
//             junit 'build/**/TEST-*.xml'
//             junit 'custom-report/TEST-*.xml'
            xunit (tools: [ JUnit(pattern: 'build/**/TEST-*.xml') ], skipPublishingChecks: false)
//             xunit (tools: [ JUnitType(pattern: 'custom-report/TEST-*.xml') ], skipPublishingChecks: false)
            xunit (
                thresholds: [[$class: 'FailedThreshold', unstableThreshold: '1']],
                tools: [[$class: 'JUnitType', pattern: 'build/**/TEST-*.xml']]
            )
        }
    }
}
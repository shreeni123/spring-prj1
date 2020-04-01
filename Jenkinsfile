pipeline {
    agent any
    tools {
        jdk 'jdk8'
        maven  'm3'
    }
    stages {
        stage('Checkout SCM'){
            steps {
                checkout scm
            }
            post{
                always{
                    sh 'echo Clone Succesfull'
                }
            }
        }
        stage('Compile'){
            steps {
                sh 'mvn compile'
            }
        }
        stage('Test'){
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            echo 'BUILD DONE'
        }
        success {
            echo 'SUCESS'
        }
        failure {
                 slackSend baseUrl: 'https://hooks.slack.com/services/', channel: '#shree-test', color: 'danger', message: "Build Started: ${env.JOB_NAME} ${env.BUILD_NUMBER} - Build STATUS ${currentBuild.description}",teamDomain: 'pragraconsulting2020', tokenCredentialId: 'slack'
        }
    }
}

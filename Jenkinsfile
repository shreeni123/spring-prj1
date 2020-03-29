pipeline {
    agent { label 'worker-1'}
    tools {
        jdk 'jdk8'
        maven  'm3'
    }
    stages {
        stage('Checkout SCM'){
            steps {
                 git branch: 'master', url: 'https://github.com/atinsingh/spring-prj1.git'
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
                 slackSend baseUrl: 'https://hooks.slack.com/services/', channel: '#devops_march', color: 'danger', message: "Build Started: ${env.JOB_NAME} ${env.BUILD_NUMBER} - Build STATUS ${env.BUILD_STATUS}",teamDomain: 'pragraconsulting2020', tokenCredentialId: 'slack'
        }
    }
}

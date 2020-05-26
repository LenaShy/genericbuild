def call(Map config=[:]){
node {
  stage('SCM') {
    echo 'Gathering code from version control'
    //git branch: '${branch}', url: 'https://github.com/LenaShy/JenkinsLearning2.git'
  }
  stage('Build') {
    echo 'Building...'
    echo config.target
    releasenotes()
  }
  stage('Test') {
    echo 'Testing...'
  }
  stage('Deploy') {
    echo 'Deploying...'
  }
}
}

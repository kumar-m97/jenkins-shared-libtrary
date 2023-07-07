def call() {
	sh 'docker build . -t app-server:v53'
	sh 'docker tag app-server:v53 kumarmlive/kumar:v53'
	sh 'docker push kumarmlive/kumar:v53'
}

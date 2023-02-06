pipeline {
    agent any

    stages 
	{
        stage('Build') 
		{
            steps 
			{
                echo 'Build Application'
            }
        }
		
		stage('Test') 
		{
            steps 
			{
                echo 'Test App'
            }
        }
		
		stage('Deploy') 
		{
            steps 
			{
                echo 'Deploy Application'
            }
        }
    }
    
    post
    {
        always
        {
             emailext body: 'Summary', subject: 'Pipeline Status', to: 'aware_akshay@rediffmail.com'
        }
    }
}

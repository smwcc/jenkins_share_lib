package org.devops

//scan
def SonarScan(projectName,projectDesc,projectPath){
    
        def scannerHome = "/opt/sonar-scanner/sonar-scanner-4.2.0.1873-linux/"
        def sonarServer = "http://192.168.16.130:9000/"
        def sonarDate = sh  returnStdout: true, script: 'date  +%Y%m%d%H%M%S'
        sonarDate = sonarDate - "\n"
        
        sh """ 
            ${scannerHome}/bin/sonar-scanner --Dsonar.host.url=${sonarServer} \
           -Dsonar.projectKey=${projectName} \
           -Dsonar.projectName=${projectName} \
           -Dsonar.projectVersion=${sonarDate} \
           -Dsonar.login=admin \
           -Dsonar.password=admin \
           -Dsonar.ws.timeout=30 \
           -Dsonar.projectDescription=${projectDesc} \
           -Dsonar.links.homepage=http://www.baidu.com \
           -Dsonar.sources=${projectPath} \
           -Dsonar.sourceEncoding=UTF-8 \
           -Dsonar.java.binaries=target/classes \
           -Dsonar.java.test.binaries=target/test-classes \
           -Dsonar.java.surefire.report=target/surefire-reports
        """
}

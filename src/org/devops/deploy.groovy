package org.devops
//ansible
def AnsibleDeploy(hosts,func){
    sh " ansible ${hosts} ${func}" 
}

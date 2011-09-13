import org.codehaus.groovy.grails.commons.ConfigurationHolder

class ExecReport extends BaseReport{

    String ctxCommand
    String ctxController
    String jcExecId
    String jcJobId
    Boolean adhocExecution
    String adhocScript
    String abortedByUser

    static mapping = {
        def config = ConfigurationHolder.config
        if (config.rundeck.v14.rdbsupport == 'true') {
            adhocScript type: 'text'
        }
    }

    static constraints = {
        adhocExecution(nullable:true)
        ctxCommand(nullable:true,blank:true)
        ctxController(nullable:true,blank:false)
        jcExecId(nullable:true,blank:false)
        jcJobId(nullable:true,blank:false)
        adhocScript(nullable:true,blank:true)
        abortedByUser(nullable:true,blank:true)
    }
}

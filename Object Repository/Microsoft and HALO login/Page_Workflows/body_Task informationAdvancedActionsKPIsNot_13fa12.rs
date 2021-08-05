<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Task informationAdvancedActionsKPIsNot_13fa12</name>
   <tag></tag>
   <elementGuidId>d5afc037-6560-4745-8c3b-1397b2933978</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>body.t-Dialog-page.t-Dialog-page--standard.apex-side-nav.apex-icons-fontapex_latest.apex-theme-halo-3-0.js-dialogReady</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>t-Dialog-page t-Dialog-page--standard apex-side-nav apex-icons-fontapex_latest apex-theme-halo-3-0 js-dialogReady</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>


  
  
      
      
      



  
      Task informationAdvancedActionsKPIsNotification and escalationCreation- and Completion notifications
    
  
											
     												Task information

													 



Disabled

 

Task steps which are already used in records cannot be deleted, but you can disable the task step to stop it from occurring in new records.



     



  
    
    
      Sorting
      


 

move up


Task sort order
1

 



      
    
    
  




 

    
    
    



Task title





Task Description
&lt;p>Populate the details of the organizational entity.&lt;/p>
Task Description, rich text editorEditor toolbars BoldKeyboard shortcut Ctrl+B ItalicKeyboard shortcut Ctrl+I Remove Format Insert/Remove Numbered List Insert/Remove Bulleted List LinkKeyboard shortcut Ctrl+K Unlink UndoKeyboard shortcut Ctrl+Z RedoKeyboard shortcut Ctrl+Y▲Press ALT 0 for help◢




Task will be assigned to group

Aggregate Report Approval
Aggregate Report Medical Writer
Aggregate Report Reviewer
Aggregate Reporting Module
Annex A.1 Data Owner
Annex B.1 Data Owner
Annex B.2 Data Owner
Annex B.3 Data Owner
Annex B.3 Data Owner Tech. Providers and Ext. Auditors
Annex C.1 Data Owner
Annex E.1 Data Owner
Annex E.1 Data Reviewer
Annex F.1 Data Owner
Annex G.1 Data Owner
Annex G.2 Data Owner
Annex G.4 Data Owner
Annex H.1 Data Owner
Annex H.2 Data Owner
Application management
Automations
Blinding flag edit
Central Business configuration team
Central ICSR management
Central review / approval
Chapter 8.5.1 Data Owner
Clinical Studies Module
Communication / Interactions Module
Customer Complaints Module
Dashboard
Data Collection Programs Module
Data collection program Notifications
Device Vigilance Module
Document template editor
EU QPPV
Entities and Agreements Module
Entities approval
Entities processing
Entities review
GDPR
Generic Organizational entity processing
Generic PSMF processing
Generic role
Global Admin
ICSR Case processing
ICSR Medical Review
ICSR Quality Control
ICSR Submission
ICSRs Module
Incident manager
Incident reporter
Information Security Officer
Interface / Integration responsible
Internal Agreements Notification
Investigator
Literature Monitoring Module
Local Org. entity processing
Local Organizational Entity / PV agreement handling
Local Organizational Entity / PV agreement management
Local QPPV
Local QPPV Backup
Local contact person
Locally nominated
Main PSMF Reviewer
Management
Not in use
Nullification
Official / main contact person
PSMF Module
PSMF Reviewer
PSMF manager / responsible
PV contact (Backup)
PV contact (Clinical)
PV contact (Marketed)
Privacy data access
Privacy flag edit
Product processing
Products Module
QPPV Backup
QPPV Deputy
QPPV Office
Quality Management Module
Requirements Intelligence Approval
Requirements Intelligence Module
Requirements Intelligence Processing
Requirements Intelligence Reviewer
Retention manager
Risk Management Module
Signal Management Module
Study List Data  Owner
Study processing
Submissions Module
Triage
Unblinding
User admin
User configuration - Basic user interface
WF Admin global
Workflow manager




    




												
											
										

  
 
  
    Advanced
  
  
 
 
   
    
    
   
   
     



Task type

Manual
Automatic (function)
Automatic (external bot)



Automation function

GOM_ASSIGN_ARGUS_CONFIG_TASKS_BOT (Automatically creates an Argus rule configuration task (Create/Update/Deactivate) if the relevant custom tag is selected)
GOM_AUTOMATIC_KEYWORD_ROUTING (Automatically routes a case to a specific workflow based on keywords (looks for matching context > Keyword pairs in the &quot;Auto routing&quot; system configuration switches))
GOM_BASIC_COMPREHEND_TO_JSON_R3_BOT (Converts a basic JSON structure (HALO ICSR intake form, PAGE 151) into R3 JSON and creates and ICSR case based on the output. comprehend is used for the medical history of the input.)
GOM_CLEAR_PAGE_54_RMA_RECORDS (Deletes all records in the Risk management activities workflow (182))
GOM_COMPLETE_WF_STEP_BOT (Automatically completes a workflow step)
GOM_COMPLETE_WF_STEP_BOT_NO_OPEN_CHILDREN (This version of the workflow completion automation, closes the step once all child records are closed. Only records in the workflows listed in system switch GOM_COMPLETE_WF_STEP_BOT_NO_OPEN_CHILDREN > Workflow IDs are considered.)
GOM_COMPLETE_WF_STEP_ON_DUE_BOT (Automatically completes the workflow step, when the step due date is reached)
GOM_COMPREHEND_BOT (Automatically generates an AWS Medical Comprehend interpretation of a text field)
GOM_COMPREHEND_TO_JSON_R3_BOT (This automation converts JSON comprehend files into HALO E2B R2 JSON files, and calls the R3 Import API using the generated JSON file.)
GOM_DCP_RECONS_BOT (Automatically creates a reconciliation task for Data collection programs)
GOM_EC_SUBMISSION (Schedules submissions to Ethics committees. The function automatically identifies committees linked to the studies selected in the aggregate report configuration.)
GOM_GENERATE_REPORTS (Generates schedule report (this automation only works on Submission records))
GOM_GRANT_ACCESS_BOT (Automatically grants access to role upon completion of a Access granting training record)
GOM_IMPORT_E2B_R3 (This function imports E2B R3 files via the JSON import function in HALO. The importer uses the R3 > JSON conversion webservice configured in System configuration > R3 > JSON Converter.)
GOM_INVESTIGATOR_SUBMISSION (Schedules submission records to investigators. The automation must be setup on a workflow where the aggregate reporting configuration child form (Page 143) is available. The automation uses the Study ID of the configuration to find relevant investigators. The target workflow is configured in the System configuration switch &quot;Aggregated reports - Investigator notification > Investigator notification workflow ID&quot;)
GOM_LITERATURE_SEARCH_CALL (Calls the Literature search API. The automation requires the Literature search child form (Page 48))
GOM_PAGE111_TRANSFER_CAPAS (Transfers Finding records to the Audit workflow if: 1) PSMF relevant flag is set to Yes 2) Audit report ID is not already present in the Audit workflow. If the audit report ID is already there it should overwrite with Yes / No.)
GOM_PAGE161_SET_EU_FLAG (Sets the the EU flag on Page 161 child records according to the following logic: Set the flag (CHILD_NUM_1) to Yes, if the DRUG CODE is found in a product license record (FAMILY NAME) and the DRUG code contains &quot;BAY&quot;)
GOM_PAGE34_SET_EU_FLAG (Sets the the EU flag on Page 34 child records according to the following logic: Set the flag (CHILD_NUM_20) to Yes (1), if the record title (license) exists in at least one record where the territory is an EU country)
GOM_PROCESS_ACKS (Processes incoming E2B acknowledgment files (R2 and R3) and progresses the workflow according to the received ack content)
GOM_SCHEDULE_SUBMISSION_RECORDS (This automation runs on ICSR records, and schedules submission records (as child records) based on  ICSR reporting rules)
GOM_SETUP_DATARETENTION_BOT (This automation creates data retention records based on retention configuration.)
GOM_SETUP_TIMEREG_BOT (This automation assigns timesheet registration records to all applicable users. The configuration of the timesheet record is taken from the record where the automation runs. The automation is configured under System configuration > Timereg.)
GOM_SETUP_TRAINING_BOT (Automatically creates Access granting training records for people configured in a Training setup)
GOM_SOFT_DELETE_BOT (This procedure nullifies the parent record of the deletion record. The automation should be used in conjunction with deletion workflows (Data retention))
GOM_SUBMIT_REPORT (This automation submits the report attached in a Submission record to the destination configured in &quot;Reporting to&quot; of the record)
GOM_SUBMIT_REPORT_VIA_EMAIL (This automation sends an email with the generated report attached to a submission record. The receiver of the email is taken from the owner organization of the submission record (users with write access to the task step where the automation is configured and notifications enabled). If the submission is marked for non-submission, the step is skipped.)
GOM_TEXTRACT_TO_KEYWORDS (Extracts text from PDF, JPEG, JPG and PNG files. Text keywords are extracted and added the the record keyword list.)
GOM_UPDATE_KPI_HEATMAP_DATA ()
GOM_UPDATE_TYPE (Updates the type of the master record)
SDB_GET_ACTIONS_STATUS ()
SDB_GET_ICSR_STATUS ()
SDB_GET_SUBMISSION_STATUS ()
SDB_TRANSFER_REGREQ ()





Enable late task investigation reason?

YesNo



Lock related Process record?

YesNo





Force routing notes on completion?

YesNo



Hide records for other users when individually assigned?

YesNo





Allow user date override?

YesNo



Execute field validations?

YesNo




     
   
   
    
    
   
 



  
  Actions


Report SettingsInteractive Grid. Report: Primary Report, View: Grid.Row headerActionSort orderAction typeNo data foundRow 1, Column 1. Row headerActionSort orderAction typeEntities form1Link Only1 rows selectedPage rowsTotal 1Report ViewRow 1 of 1No data foundActionEntities formSort order1Action typeLink Only





Link Only
Link (Show on complete)




var gIg125049729068445388data = {
&quot;values&quot;:[
[
&quot;1322&quot;
,{
&quot;v&quot;:&quot;16&quot;
,&quot;d&quot;:&quot;Entities form&quot;
}
,&quot;201&quot;
,&quot;1&quot;
,{
&quot;v&quot;:&quot;2&quot;
,&quot;d&quot;:&quot;Link Only&quot;
}
,&quot;0&quot;
,{
&quot;salt&quot;:&quot;duSlaLGD6RcYoOB_W5ULMQ&quot;
,&quot;protected&quot;:&quot;MTMyMzc3NjIyMjY5NzU1Njk2OjEzMjM3NzgzMDE1NTc1NTY5ODoxMzIzNzgxOTM0.,NTM3NTU3MDE~\/lYSh_ZytfqsU9qhtHwGLNEFyd2OuYklbgVidDwmrV1bpHUj4QnhTUz5qGQ7ihNACDReZX7Owyj932n5h0TdSJw&quot;
,&quot;rowVersion&quot;:&quot;ty-1ESm7VhQVMNqNgQ3rylx9zvzwTz-BttmnlwEtOwfPiE_yCj-td-R-0Z4VyqAIZ969kE8nXsL5iNSPDDyv4A&quot;
,&quot;fields&quot;:{
&quot;ID&quot;:{
&quot;ck&quot;:&quot;gBX3ruXTGK8AEXVg8SE2c7mLVOUbO2TdZLd2s1o0b2v8Hzt-5QG1psBF-nMm9ZDq3BO6NRsbDlrlEzyW7zFPfg&quot;
}
,&quot;WF_TASK_ACTION_REPEAT&quot;:{
&quot;ck&quot;:&quot;ntwNEgVjP_lG0My9diIdUGpnZ4kJD3NwmrYJ0dunH0Iyv1-idY12RNzK3ut0KqCLjz0fwLB3MIKezOZ8dqPqLQ&quot;
}
,&quot;WF_TASK_ID&quot;:{
&quot;ck&quot;:&quot;4egF7meIkQ___OAuVSZkAHTSZPANiXqBU4N7OCWUpJ2LRa2GP-KNLUDzHguS5KVCDUMsUBtHF2Fw-ZVd1qGtPQ&quot;
}
}
}
]
]
,&quot;firstRow&quot;:1
,&quot;moreData&quot;:false
,&quot;totalRows&quot;:1
}
;




  
 
  
    KPIs
  
  
 
 
   
    
    
   
   
     



KPI High





KPI Low



Task specific KPIs - if left blank the Process KPI applies
     
   
   
    
    
   
 



  
 
  
    Notification and escalation
  
  
 
 
   
    
    
   
   
     



Days allocated for task





Notify days before due date





Escalate after additional days





Task will be escalated (email) to

Aggregate Report Approval
Aggregate Report Medical Writer
Aggregate Report Reviewer
Aggregate Reporting Module
Annex A.1 Data Owner
Annex B.1 Data Owner
Annex B.2 Data Owner
Annex B.3 Data Owner
Annex B.3 Data Owner Tech. Providers and Ext. Auditors
Annex C.1 Data Owner
Annex E.1 Data Owner
Annex E.1 Data Reviewer
Annex F.1 Data Owner
Annex G.1 Data Owner
Annex G.2 Data Owner
Annex G.4 Data Owner
Annex H.1 Data Owner
Annex H.2 Data Owner
Application management
Automations
Blinding flag edit
Central Business configuration team
Central ICSR management
Central review / approval
Chapter 8.5.1 Data Owner
Clinical Studies Module
Communication / Interactions Module
Customer Complaints Module
Dashboard
Data Collection Programs Module
Data collection program Notifications
Device Vigilance Module
Document template editor
EU QPPV
Entities and Agreements Module
Entities approval
Entities processing
Entities review
GDPR
Generic Organizational entity processing
Generic PSMF processing
Generic role
Global Admin
ICSR Case processing
ICSR Medical Review
ICSR Quality Control
ICSR Submission
ICSRs Module
Incident manager
Incident reporter
Information Security Officer
Interface / Integration responsible
Internal Agreements Notification
Investigator
Literature Monitoring Module
Local Org. entity processing
Local Organizational Entity / PV agreement handling
Local Organizational Entity / PV agreement management
Local QPPV
Local QPPV Backup
Local contact person
Locally nominated
Main PSMF Reviewer
Management
Not in use
Nullification
Official / main contact person
PSMF Module
PSMF Reviewer
PSMF manager / responsible
PV contact (Backup)
PV contact (Clinical)
PV contact (Marketed)
Privacy data access
Privacy flag edit
Product processing
Products Module
QPPV Backup
QPPV Deputy
QPPV Office
Quality Management Module
Requirements Intelligence Approval
Requirements Intelligence Module
Requirements Intelligence Processing
Requirements Intelligence Reviewer
Retention manager
Risk Management Module
Signal Management Module
Study List Data  Owner
Study processing
Submissions Module
Triage
Unblinding
User admin
User configuration - Basic user interface
WF Admin global
Workflow manager





Create new workflow on escalation

AWS account
Access management
Aggregate reporting process
Agreements
Annex A.1 - QPPV Delegated Tasks
Annex A.2 - CV QPPV
Annex A.3 - EudraVigilance Registration
Annex A.4 - CV Deputy QPPV
Annex B.1 - Organizational Charts (Data Owner)
Annex B.1 - Organizational Charts (QPPV O)
Annex B.2 - Contact Details of Data Entry Sites
Annex B.3 - Content Update
Annex B.3 - List of PV Related Contracts and Agreements
Annex C.1 - PV Country Contact List
Annex E.1 - List of Global Quality System Documents
Annex F.1 - Content Update
Annex F.1 - List of Performance Indicators
Annex G.1 - Audit Schedule
Annex G.2 - List of Conducted Audits
Annex G.4 - Deviations
Annex H.1 - List of Medicinal Products
Annex H.2 - Content Update
Annex H.2 - Safety Monitoring Requirements
Annex I.1 - Logbook
Annex I.2 - History  of Changes for Annex Contents
Application help text
Bloods
Bulk Reconciliation
CS Customer Complaints
CS Incidents
CS Problems / solutions
CS Service/Change requests
Cancelled data collection programs
Chapter 8.5.1 - Open CAPAs
Clinical studies
Customer
Customer Complaints
Data Monitoring Committees recommendations requirements
Data collection program - QC
Data collection program - Reconciliation
Data collection programs
Data collection programs - Delete
Data collection programs - Retention configuration
Data retention policies
Development Safety Update Report (DSUR) requirements
Device vigilance / reporting
Device vigilance / reporting_COPY
Document A - Deletion workflow
Document intake
Document type A
Document type B
Entities Management (External)
Entities Management (Internal)
Entities document snippets
Findings / CAPAs
GVP Audits
ICSR Processing
ICSR Submission (Automated via gateway)
ICSR Submission (Manual submission)
ICSR follow-up
ICSR follow-up (automated update of Argus)
ICSR intake
ICSR reporting requirements
Investigation
Legal holds
Literature article review
Literature monitoring
Local QPPV/safety responsible person requirements
Main Body review
Main PSMF
No signal
Non validated signal
Non-conformities
PV system and system master file requirements
Page snippets
Perform Access Granting Training
Periodic SUSAR reporting requirements
Periodic Safety Update Report (PSUR) requirements
Periodic reporting requirements for Medical devices
Physical Storage (box)
Physical documents scanned
Physical records
Physical storage (Locations)
Product Family Management
Product License Management
Product Management
QMS Documents
Reconciliation records
Refuted ICSRs
Refuted signal
Regulatory and other requirements documents
Renewal document requirements
Requirements impact assessment
Risk Management Document snippets
Risk management activities (incl. Risk minimization)
Risk management documents
Risk management plans (RMP)/documents requirements
Risk management strategy
Safety concerns
Setup training
Signal Detection / Management requirements
Signal Management
Signal detection / surveillance
Signal notification
Study List
System/Server Information
Time registration
Update Argus Expedited reporting rules
test




     
   
   
    
    
   
 



  
  Creation- and Completion notifications


Report SettingsInteractive Grid. Report: Primary Report, View: Grid.Row headerTypeGroupCreatorIn-appWhere ClauseMessageMail SubjectRe-routedRoutebackNo notifications are configuredColumn 8. Row headerTypeGroupCreatorIn-appWhere ClauseMessageMail SubjectRe-routedRoutebackOn CreateAnnex B.3 Data Owner Tech. Providers and Ext. AuditorsNoNo1 rows selectedPage rowsTotal 1Report ViewAddedRow 1 of 1No notifications are configuredTypeOn CreateGroupAnnex B.3 Data Owner Tech. Providers and Ext. AuditorsCreatorNoIn-appNoWhere ClauseMessageMail SubjectRe-routedRouteback





Yes
No


Yes
No






Yes
No


Yes
No


Backend-job
On Complete
On Create

Aggregate Report Approval
Aggregate Report Medical Writer
Aggregate Report Reviewer
Aggregate Reporting Module
Annex A.1 Data Owner
Annex B.1 Data Owner
Annex B.2 Data Owner
Annex B.3 Data Owner
Annex B.3 Data Owner Tech. Providers and Ext. Auditors
Annex C.1 Data Owner
Annex E.1 Data Owner
Annex E.1 Data Reviewer
Annex F.1 Data Owner
Annex G.1 Data Owner
Annex G.2 Data Owner
Annex G.4 Data Owner
Annex H.1 Data Owner
Annex H.2 Data Owner
Application management
Automations
Blinding flag edit
Central Business configuration team
Central ICSR management
Central review / approval
Chapter 8.5.1 Data Owner
Clinical Studies Module
Communication / Interactions Module
Customer Complaints Module
Dashboard
Data Collection Programs Module
Data collection program Notifications
Device Vigilance Module
Document template editor
EU QPPV
Entities and Agreements Module
Entities approval
Entities processing
Entities review
GDPR
Generic Organizational entity processing
Generic PSMF processing
Generic role
Global Admin
ICSR Case processing
ICSR Medical Review
ICSR Quality Control
ICSR Submission
ICSRs Module
Incident manager
Incident reporter
Information Security Officer
Interface / Integration responsible
Internal Agreements Notification
Investigator
Literature Monitoring Module
Local Org. entity processing
Local Organizational Entity / PV agreement handling
Local Organizational Entity / PV agreement management
Local QPPV
Local QPPV Backup
Local contact person
Locally nominated
Main PSMF Reviewer
Management
Not in use
Nullification
Official / main contact person
PSMF Module
PSMF Reviewer
PSMF manager / responsible
PV contact (Backup)
PV contact (Clinical)
PV contact (Marketed)
Privacy data access
Privacy flag edit
Product processing
Products Module
QPPV Backup
QPPV Deputy
QPPV Office
Quality Management Module
Requirements Intelligence Approval
Requirements Intelligence Module
Requirements Intelligence Processing
Requirements Intelligence Reviewer
Retention manager
Risk Management Module
Signal Management Module
Study List Data  Owner
Study processing
Submissions Module
Triage
Unblinding
User admin
User configuration - Basic user interface
WF Admin global
Workflow manager


var gIg86745126998172990data = {
&quot;values&quot;:[
]
,&quot;firstRow&quot;:1
,&quot;moreData&quot;:false
,&quot;totalRows&quot;:0
}
;





  Available placeholders
You can use the following placeholder tags in mail subject and Message fields to add dynamic content






Placeholder Tag
Placeholder Tag
{MAIL_PARENT_RECORD_TITLE}{MAIL_MASTER_DUEDATE}{MAIL_MASTER_TITLE}{MAIL_MASTER_TYPE}{STANDARDLINK}                   1 -                    5Configure more placeholders


 





  




      
  
  
  
    
    
      Buttons
      
      
    
    ReturnSaveDelete
  






var apex_img_dir = &quot;/i/&quot;, htmldb_Img_Dir = apex_img_dir;








apex.da.initDaEventList = function(){
apex.da.gEventList = [
{&quot;bindEventType&quot;:&quot;ready&quot;,&quot;anyActionsFireOnInit&quot;:false,actionList:[{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,javascriptFunction:function (){ $(&quot;.t-Body-alert&quot;).delay(2000).fadeOut();
},&quot;action&quot;:&quot;NATIVE_JAVASCRIPT_CODE&quot;}]},
{&quot;triggeringElementType&quot;:&quot;ITEM&quot;,&quot;triggeringElement&quot;:&quot;P19_WF_TASK_ACTION_1_MANDATORY&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_1_MANDATORY&quot;,&quot;triggeringConditionType&quot;:&quot;IN_LIST&quot;,&quot;triggeringExpression&quot;:&quot;2,3&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;change&quot;,&quot;anyActionsFireOnInit&quot;:true,actionList:[{&quot;eventResult&quot;:false,&quot;executeOnPageInit&quot;:true,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_1_REPEAT&quot;,javascriptFunction:apex.da.enable,&quot;action&quot;:&quot;NATIVE_ENABLE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:true,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_1_REPEAT&quot;,javascriptFunction:apex.da.disable,&quot;action&quot;:&quot;NATIVE_DISABLE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_1_REPEAT&quot;,javascriptFunction:apex.da.clear,&quot;action&quot;:&quot;NATIVE_CLEAR&quot;}]},
{&quot;triggeringElementType&quot;:&quot;ITEM&quot;,&quot;triggeringElement&quot;:&quot;P19_WF_TASK_ACTION_2_MANDATORY&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_2_MANDATORY&quot;,&quot;triggeringConditionType&quot;:&quot;IN_LIST&quot;,&quot;triggeringExpression&quot;:&quot;2,3&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;change&quot;,&quot;anyActionsFireOnInit&quot;:true,actionList:[{&quot;eventResult&quot;:false,&quot;executeOnPageInit&quot;:true,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_2_REPEAT&quot;,javascriptFunction:apex.da.enable,&quot;action&quot;:&quot;NATIVE_ENABLE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:true,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_2_REPEAT&quot;,javascriptFunction:apex.da.disable,&quot;action&quot;:&quot;NATIVE_DISABLE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_2_REPEAT&quot;,javascriptFunction:apex.da.clear,&quot;action&quot;:&quot;NATIVE_CLEAR&quot;}]},
{&quot;triggeringElementType&quot;:&quot;ITEM&quot;,&quot;triggeringElement&quot;:&quot;P0_GLOBAL_SEARCH&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_2_MANDATORY&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;keypress&quot;,&quot;anyActionsFireOnInit&quot;:false,actionList:[{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:false,&quot;waitForResult&quot;:true,javascriptFunction:apex.da.executePlSqlCode,&quot;ajaxIdentifier&quot;:&quot;REEgVFlQRX5-MjIxNzQyMDYwODExODM3MDM~\u002F6dbT8IE0NbG-tUPfZQAHoXBzk04PDLAwSkbzhcnC-TAAm0XJQo81duJm4Ca8DJyHN-x_PNrLe09IbpjOJYn4TA&quot;,&quot;attribute01&quot;:&quot;#P0_GLOBAL_SEARCH,#APPLICATION_GLOBAL_SEARCH&quot;,&quot;attribute02&quot;:&quot;#APPLICATION_GLOBAL_SEARCH&quot;,&quot;attribute04&quot;:&quot;N&quot;,&quot;action&quot;:&quot;NATIVE_EXECUTE_PLSQL_CODE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P0_GLOBAL_SEARCH&quot;,javascriptFunction:function (){   if (event.which === 13) {
   var lvalue  = $v(&quot;P0_GLOBAL_SEARCH&quot;);
   event.preventDefault();
   alert(lvalue);
   apex.item( &quot;P0_GLOBAL_SEARCH&quot; ).setValue(lvalue);
   document.getElementById(&quot;GO&quot;).click();
  }
},&quot;action&quot;:&quot;NATIVE_JAVASCRIPT_CODE&quot;}]},
{&quot;triggeringElementType&quot;:&quot;ITEM&quot;,&quot;triggeringElement&quot;:&quot;P19_WF_TASK_ACTION_3_MANDATORY&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_3_MANDATORY&quot;,&quot;triggeringConditionType&quot;:&quot;IN_LIST&quot;,&quot;triggeringExpression&quot;:&quot;2,3&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;change&quot;,&quot;anyActionsFireOnInit&quot;:true,actionList:[{&quot;eventResult&quot;:false,&quot;executeOnPageInit&quot;:true,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_3_REPEAT&quot;,javascriptFunction:apex.da.enable,&quot;action&quot;:&quot;NATIVE_ENABLE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:true,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_3_REPEAT&quot;,javascriptFunction:apex.da.disable,&quot;action&quot;:&quot;NATIVE_DISABLE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_3_REPEAT&quot;,javascriptFunction:apex.da.clear,&quot;action&quot;:&quot;NATIVE_CLEAR&quot;}]},
{&quot;triggeringElementType&quot;:&quot;ITEM&quot;,&quot;triggeringElement&quot;:&quot;P19_WF_TASK_ACTION_4_MANDATORY&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_4_MANDATORY&quot;,&quot;triggeringConditionType&quot;:&quot;IN_LIST&quot;,&quot;triggeringExpression&quot;:&quot;2,3&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;change&quot;,&quot;anyActionsFireOnInit&quot;:true,actionList:[{&quot;eventResult&quot;:false,&quot;executeOnPageInit&quot;:true,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_4_REPEAT&quot;,javascriptFunction:apex.da.enable,&quot;action&quot;:&quot;NATIVE_ENABLE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:true,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_4_REPEAT&quot;,javascriptFunction:apex.da.disable,&quot;action&quot;:&quot;NATIVE_DISABLE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_4_REPEAT&quot;,javascriptFunction:apex.da.clear,&quot;action&quot;:&quot;NATIVE_CLEAR&quot;}]},
{&quot;triggeringElementType&quot;:&quot;ITEM&quot;,&quot;triggeringElement&quot;:&quot;P19_WF_TASK_ACTION_5_MANDATORY&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_5_MANDATORY&quot;,&quot;triggeringConditionType&quot;:&quot;IN_LIST&quot;,&quot;triggeringExpression&quot;:&quot;2,3&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;change&quot;,&quot;anyActionsFireOnInit&quot;:true,actionList:[{&quot;eventResult&quot;:false,&quot;executeOnPageInit&quot;:true,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_5_REPEAT&quot;,javascriptFunction:apex.da.enable,&quot;action&quot;:&quot;NATIVE_ENABLE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:true,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_5_REPEAT&quot;,javascriptFunction:apex.da.disable,&quot;action&quot;:&quot;NATIVE_DISABLE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_5_REPEAT&quot;,javascriptFunction:apex.da.clear,&quot;action&quot;:&quot;NATIVE_CLEAR&quot;}]},
{&quot;triggeringElementType&quot;:&quot;ITEM&quot;,&quot;triggeringElement&quot;:&quot;P19_WF_TASK_ACTION_6_MANDATORY&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_6_MANDATORY&quot;,&quot;triggeringConditionType&quot;:&quot;IN_LIST&quot;,&quot;triggeringExpression&quot;:&quot;2,3&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;change&quot;,&quot;anyActionsFireOnInit&quot;:true,actionList:[{&quot;eventResult&quot;:false,&quot;executeOnPageInit&quot;:true,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_6_REPEAT&quot;,javascriptFunction:apex.da.enable,&quot;action&quot;:&quot;NATIVE_ENABLE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:true,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_6_REPEAT&quot;,javascriptFunction:apex.da.disable,&quot;action&quot;:&quot;NATIVE_DISABLE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_6_REPEAT&quot;,javascriptFunction:apex.da.clear,&quot;action&quot;:&quot;NATIVE_CLEAR&quot;}]},
{&quot;triggeringElementType&quot;:&quot;ITEM&quot;,&quot;triggeringElement&quot;:&quot;P19_WF_TASK_ACTION_1&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_1&quot;,&quot;triggeringConditionType&quot;:&quot;NULL&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;change&quot;,&quot;anyActionsFireOnInit&quot;:false,actionList:[{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_1_MANDATORY,P19_WF_TASK_ACTION_1_REPEAT&quot;,javascriptFunction:apex.da.clear,&quot;action&quot;:&quot;NATIVE_CLEAR&quot;}]},
{&quot;triggeringElementType&quot;:&quot;ITEM&quot;,&quot;triggeringElement&quot;:&quot;P19_WF_TASK_ACTION_2&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_2&quot;,&quot;triggeringConditionType&quot;:&quot;NULL&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;change&quot;,&quot;anyActionsFireOnInit&quot;:false,actionList:[{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_2_MANDATORY,P19_WF_TASK_ACTION_2_REPEAT&quot;,javascriptFunction:apex.da.clear,&quot;action&quot;:&quot;NATIVE_CLEAR&quot;}]},
{&quot;triggeringElementType&quot;:&quot;ITEM&quot;,&quot;triggeringElement&quot;:&quot;P19_WF_TASK_ACTION_3&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_3&quot;,&quot;triggeringConditionType&quot;:&quot;NULL&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;change&quot;,&quot;anyActionsFireOnInit&quot;:false,actionList:[{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_3_MANDATORY,P19_WF_TASK_ACTION_3_REPEAT&quot;,javascriptFunction:apex.da.clear,&quot;action&quot;:&quot;NATIVE_CLEAR&quot;}]},
{&quot;triggeringElementType&quot;:&quot;ITEM&quot;,&quot;triggeringElement&quot;:&quot;P19_WF_TASK_ACTION_4&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_4&quot;,&quot;triggeringConditionType&quot;:&quot;NULL&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;change&quot;,&quot;anyActionsFireOnInit&quot;:false,actionList:[{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_4_MANDATORY,P19_WF_TASK_ACTION_4_REPEAT&quot;,javascriptFunction:apex.da.clear,&quot;action&quot;:&quot;NATIVE_CLEAR&quot;}]},
{&quot;triggeringElementType&quot;:&quot;ITEM&quot;,&quot;triggeringElement&quot;:&quot;P19_WF_TASK_ACTION_5&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_5&quot;,&quot;triggeringConditionType&quot;:&quot;NULL&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;change&quot;,&quot;anyActionsFireOnInit&quot;:false,actionList:[{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_5_MANDATORY,P19_WF_TASK_ACTION_5_REPEAT&quot;,javascriptFunction:apex.da.clear,&quot;action&quot;:&quot;NATIVE_CLEAR&quot;}]},
{&quot;triggeringElementType&quot;:&quot;ITEM&quot;,&quot;triggeringElement&quot;:&quot;P19_WF_TASK_ACTION_6&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_6&quot;,&quot;triggeringConditionType&quot;:&quot;NULL&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;change&quot;,&quot;anyActionsFireOnInit&quot;:false,actionList:[{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;affectedElementsType&quot;:&quot;ITEM&quot;,&quot;affectedElements&quot;:&quot;P19_WF_TASK_ACTION_6_MANDATORY,P19_WF_TASK_ACTION_6_REPEAT&quot;,javascriptFunction:apex.da.clear,&quot;action&quot;:&quot;NATIVE_CLEAR&quot;}]},
{&quot;triggeringElementType&quot;:&quot;BUTTON&quot;,&quot;triggeringButtonId&quot;:&quot;B32349509431534916&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_6&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;click&quot;,&quot;anyActionsFireOnInit&quot;:false,actionList:[{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;waitForResult&quot;:true,javascriptFunction:apex.da.executePlSqlCode,&quot;ajaxIdentifier&quot;:&quot;REEgVFlQRX5-MzIzNzUyOTkwMTI1MzQ5Mjk~\u002FNLhkzLswyz0hFGY6zU2ucOLQTsq9YaPdKcqSxCGcfisds178wPCdmtyoL0NpziV_cjQIJ5Hbqpbe72OwyydWeA&quot;,&quot;attribute01&quot;:&quot;#P19_WF_TASK_SORTORDER,#P19_WF_ID,#P19_WF_TASK_ID&quot;,&quot;attribute02&quot;:&quot;#P19_WF_TASK_SORTORDER&quot;,&quot;attribute04&quot;:&quot;N&quot;,&quot;action&quot;:&quot;NATIVE_EXECUTE_PLSQL_CODE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,javascriptFunction:apex.da.submitPage,&quot;attribute01&quot;:&quot;REFRESH&quot;,&quot;attribute02&quot;:&quot;Y&quot;,&quot;action&quot;:&quot;NATIVE_SUBMIT_PAGE&quot;}]},
{&quot;triggeringElementType&quot;:&quot;BUTTON&quot;,&quot;triggeringButtonId&quot;:&quot;B32349179717534915&quot;,&quot;conditionElement&quot;:&quot;P19_WF_TASK_ACTION_6&quot;,&quot;bindType&quot;:&quot;bind&quot;,&quot;bindEventType&quot;:&quot;click&quot;,&quot;anyActionsFireOnInit&quot;:false,actionList:[{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,&quot;waitForResult&quot;:true,javascriptFunction:apex.da.executePlSqlCode,&quot;ajaxIdentifier&quot;:&quot;REEgVFlQRX5-MzIzNzY3MjEzNDQ1MzQ5Mjk~\u002FJqUvGxPqevlm8JPucnu9LC9ENQrUUTirXY5pfr1spJepKpoLC4slvReOuN7Lif6GSfokC-x9enXLhMtQRB5h3w&quot;,&quot;attribute01&quot;:&quot;#P19_WF_TASK_SORTORDER,#P19_WF_ID,#P19_WF_TASK_ID&quot;,&quot;attribute02&quot;:&quot;#P19_WF_TASK_SORTORDER&quot;,&quot;attribute04&quot;:&quot;N&quot;,&quot;action&quot;:&quot;NATIVE_EXECUTE_PLSQL_CODE&quot;},{&quot;eventResult&quot;:true,&quot;executeOnPageInit&quot;:false,&quot;stopExecutionOnError&quot;:true,javascriptFunction:apex.da.submitPage,&quot;attribute01&quot;:&quot;REFRESH&quot;,&quot;attribute02&quot;:&quot;Y&quot;,&quot;action&quot;:&quot;NATIVE_SUBMIT_PAGE&quot;}]}];
}













var htmldb_delete_message='Would you like to perform this delete action?';
  

























define(&quot;jquery&quot;,[],function(){return apex.jQuery});
define(&quot;hammerjs&quot;,[],function(){return Hammer});
define(&quot;jqueryui-amd/widget&quot;,[],function(){return apex.jQuery.widget});
define(&quot;jqueryui-amd/focusable&quot;,[],function(){return apex.jQuery.ui.focusable});
define(&quot;jqueryui-amd/position&quot;,[],function(){return apex.jQuery.ui.position});
define(&quot;jqueryui-amd/keycode&quot;,[],function(){return apex.jQuery.ui.keyCode});
define(&quot;jqueryui-amd/tabbable&quot;,[],function(){return { tabbable: function(){ apex.debug.info(&quot;Unexpected call: jQuery UI tabbable function&quot;); }}});
define(&quot;jqueryui-amd/unique-id&quot;,[],function(){return apex.jQuery.fn});






apex.session.initTimeouts(180,{&quot;idle_time_ms&quot;:3597000,&quot;life_time_ms&quot;:28756000,&quot;max_idle_time_ms&quot;:3600000},'\u002Fords\u002Fhalo\u002Fr\u002Fhalopv800\u002F1');
apex.jQuery( function() {
apex.page.init( this, function() {
apex.jQuery.when.apply( apex.jQuery, apex.page.loadingDeferreds ).done(function() {
try {
(function(){apex.widget.checkboxAndRadio(&quot;#P19_WF_TASK_DISABLED&quot;,&quot;checkbox&quot;,{&quot;ajaxIdentifier&quot;:&quot;SVRFTSBUWVBFfjUxMjB-MzIzNDg0NTAzNTg1MzQ5MTU~\u002FWrsoF4NCjJ6g0UCPgeG0zyYl3Mia_XFCTk1OQJcQhaIRAgKqSiK7Yf-xK_SafHOE53FWxzXFi-OLCOPExM1ZEA&quot;,&quot;optimizeRefresh&quot;:true,&quot;inputName&quot;:&quot;P19_WF_TASK_DISABLED&quot;});})();
(function(){apex.widget.ckeditor4(&quot;#P19_WF_TASK_DESCRIPTION&quot;,{&quot;language&quot;:&quot;en&quot;,&quot;label&quot;:&quot;Task Description&quot;,&quot;toolbar&quot;:&quot;Basic&quot;,&quot;toolbarStartupExpanded&quot;:false,&quot;toolbarLocation&quot;:&quot;top&quot;,&quot;skin&quot;:&quot;kama&quot;,&quot;contentsLangDirection&quot;:&quot;ltr&quot;,&quot;fullWidth&quot;:false});})();
(function(){apex.widget.selectList(&quot;#P19_WF_TASK_ASSIGNMENT&quot;,{&quot;nullValue&quot;:&quot;&quot;,&quot;ajaxIdentifier&quot;:&quot;SVRFTSBUWVBFfjUxMjB-MzIzNTE5NzI4ODY1MzQ5MTc~\u002FjaSV7dxKiJNTGq5ZDM1i33PT80V82SCwvoUg7IdO7QnbcjpGEuEn0HO_qNLfq199_XxnGd-Ww2LTKs7QwyGKIA&quot;});})();
(function(){apex.widget.selectList(&quot;#P19_WF_TASK_TYPE&quot;,{&quot;nullValue&quot;:&quot;&quot;,&quot;ajaxIdentifier&quot;:&quot;SVRFTSBUWVBFfjUxMjB-MzIzNDYxNTQwNTQ1MzQ5MTM~\u002F2oFbnVh1l4DhXra98i_zArk8c44l9doM4pYoi1wmhcjuYh6Ctu4Z8c_1WB80G03pPP-1z9JhbF3Vx7-YnFga5g&quot;});})();
(function(){apex.widget.selectList(&quot;#P19_WF_TASK_BOT_FUNCTION&quot;,{&quot;nullValue&quot;:&quot;&quot;,&quot;ajaxIdentifier&quot;:&quot;SVRFTSBUWVBFfjUxMjB-MzIzNDY1MjE0Nzk1MzQ5MTM~\u002FpiMzUsYbo17mqJ_DLrKWP80jXbGIKCErk1NL7onowtCD10eX-3sC4qpirhp23tjnKNhG8l2Jgi9VFEXZUartGQ&quot;});})();
(function(){apex.widget.yesNo(&quot;P19_WF_TASK_INCL_LATE_INVEST&quot;,&quot;SWITCH&quot;);})();
(function(){apex.widget.yesNo(&quot;P19_WF_TASK_LOCK_PROC_REC&quot;,&quot;SWITCH&quot;);})();
(function(){apex.widget.yesNo(&quot;P19_WF_TASK_SHOW_NOTES&quot;,&quot;SWITCH&quot;);})();
(function(){apex.widget.yesNo(&quot;P19_WF_TASK_HIDE_ON_INDIVID_ASSIGN&quot;,&quot;SWITCH&quot;);})();
(function(){apex.widget.yesNo(&quot;P19_WF_TASK_ALLOWDATEOVERRIDE&quot;,&quot;SWITCH&quot;);})();
(function(){apex.widget.yesNo(&quot;P19_WF_EXECUTE_FIELD_VALIDATIONS&quot;,&quot;SWITCH&quot;);})();
(function(){apex.widget.popupLov({&quot;itemId&quot;:&quot;C132377728629755697&quot;,&quot;ajaxIdentifier&quot;:&quot;SVRFTSBUWVBFfjc5NDB-MTMyMzc3NzI4NjI5NzU1Njk3\u002F95_K9oitY4y8NHyz-TS-wf3U8yPNaN8mmJmT1Miy5ghI-Ce-krOqGAI8wFhqsyMbOZ_0sjWMQ6YHmu0aJJqEVA&quot;,&quot;optimizeRefresh&quot;:true,&quot;isPopup&quot;:false,&quot;columns&quot;: {&quot;A&quot;: {&quot;heading&quot;:&quot;Display&quot;,&quot;headingAlignment&quot;:&quot;start&quot;,&quot;alignment&quot;:&quot;start&quot;,&quot;index&quot;:0}, &quot;B&quot;: {&quot;heading&quot;:&quot;Value&quot;,&quot;headingAlignment&quot;:&quot;start&quot;,&quot;alignment&quot;:&quot;start&quot;,&quot;index&quot;:1}},&quot;valueColumn&quot;:&quot;B&quot;,&quot;displayColumn&quot;:&quot;A&quot;,&quot;extraOut&quot;: {},&quot;persistState&quot;:true});})();
(function(){apex.widget.selectList(&quot;#C132378104005755700&quot;,{&quot;nullValue&quot;:&quot;&quot;,&quot;ajaxIdentifier&quot;:&quot;SVRFTSBUWVBFfjc5NDB-MTMyMzc4MTA0MDA1NzU1NzAw\u002F2gw2VEBPEo7euYE6x-a4LdAG60GnmydsJT2YLNHqZkPOc8LPbrekapb_IMUzyrstY1R0K1WAg5Jw0kHVXZA3Tg&quot;});})();
(function(){var ig$=apex.jQuery('#R125049729068445388_ig');ig$.interactiveGrid({&quot;config&quot;:{&quot;columns&quot;:[{&quot;id&quot;:&quot;132378308288755702&quot;,&quot;name&quot;:&quot;APEX$ROW_ACTION&quot;,&quot;staticId&quot;:&quot;C132378308288755702&quot;,&quot;isReadOnly&quot;:false,&quot;specialType&quot;:&quot;actions&quot;},{&quot;id&quot;:&quot;132377622269755696&quot;,&quot;name&quot;:&quot;ID&quot;,&quot;staticId&quot;:&quot;C132377622269755696&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isHidden&quot;:true,&quot;isPrimaryKey&quot;:true},{&quot;id&quot;:&quot;132377728629755697&quot;,&quot;name&quot;:&quot;WF_TASK_ACTION_ID&quot;,&quot;staticId&quot;:&quot;C132377728629755697&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isReadOnly&quot;:false,&quot;heading&quot;:{&quot;heading&quot;:&quot;Action&quot;,&quot;alignment&quot;:&quot;start&quot;},&quot;default&quot;:{&quot;value&quot;:{&quot;v&quot;:&quot;&quot;,&quot;d&quot;:&quot;&quot;}}},{&quot;id&quot;:&quot;132377830155755698&quot;,&quot;name&quot;:&quot;WF_TASK_ID&quot;,&quot;staticId&quot;:&quot;C132377830155755698&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isHidden&quot;:true,&quot;default&quot;:{&quot;value&quot;:&quot;201&quot;}},{&quot;id&quot;:&quot;132377949783755699&quot;,&quot;name&quot;:&quot;WF_TASK_ACTION_SORTORDER&quot;,&quot;staticId&quot;:&quot;C132377949783755699&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isReadOnly&quot;:false,&quot;heading&quot;:{&quot;heading&quot;:&quot;Sort order&quot;},&quot;layout&quot;:{&quot;columnAlignment&quot;:&quot;center&quot;},&quot;filter&quot;:{&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;hasLov&quot;:false}},{&quot;id&quot;:&quot;132378104005755700&quot;,&quot;name&quot;:&quot;WF_TASK_ACTION_TYPE&quot;,&quot;staticId&quot;:&quot;C132378104005755700&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isReadOnly&quot;:false,&quot;heading&quot;:{&quot;heading&quot;:&quot;Action type&quot;},&quot;layout&quot;:{&quot;columnAlignment&quot;:&quot;center&quot;},&quot;default&quot;:{&quot;value&quot;:{&quot;v&quot;:&quot;&quot;,&quot;d&quot;:&quot;&quot;}}},{&quot;id&quot;:&quot;132378193453755701&quot;,&quot;name&quot;:&quot;WF_TASK_ACTION_REPEAT&quot;,&quot;staticId&quot;:&quot;C132378193453755701&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isHidden&quot;:true}],&quot;ajaxColumns&quot;:&quot;MTMyMzc3NjIyMjY5NzU1Njk2OjEzMjM3NzcyODYyOTc1NTY5NzoxMzIzNzc4MzAx.,NTU3NTU2OTg6MTMyMzc3OTQ5NzgzNzU1Njk5OjEzMjM3ODEwNDAwNTc1NTcwMDox.,MzIzNzgxOTM0NTM3NTU3MDE~\u002F5E1Pv6qj7XUMC4re0B46G1IKbjNmomY0uPSVXyH1RgbQK3p1BPOiS7w70IxGbBhnD4mJxR5WYSv3iogd1qebfA&quot;,&quot;regionId&quot;:&quot;125049729068445388&quot;,&quot;regionStaticId&quot;:&quot;R125049729068445388&quot;,&quot;ajaxIdentifier&quot;:&quot;UkVHSU9OIFRZUEV-fjEyNTA0OTcyOTA2ODQ0NTM4OA~~\u002F_k-kC3lP7ZLsZuiASNQUsFPql_SuXe77OIuIA8MYuGzbScJ7eBRA1tacHTwINMQN4rp9FazuALcHsPgUKI_9mg&quot;,&quot;editable&quot;:{&quot;allowedOperations&quot;:{&quot;protected&quot;:&quot;SVVE\u002FTuwzGdYN_kHTiMSuqMtbJNLD2ILV32EWnC4MFPY9OnrvMA7vwE5iNGvz8bQH1JXfHxbB3Bvsm6ojW2f11tWwvA&quot;}},&quot;appearance&quot;:{&quot;showNullValue&quot;:&quot;-&quot;},&quot;pagination&quot;:{&quot;showTotalRowCount&quot;:true},&quot;toolbar&quot;:false,&quot;features&quot;:{&quot;download&quot;:{&quot;downloadCs&quot;:&quot;dHJ1ZQ~~\u002FFAmNmfl-zK-9CiH5PySR8abaGXjfT1MlTUe9KZK5ygmcsIyo8eRq3Rx-o-nu1MAhYf0SKBIlwF594QIRew56jA&quot;,&quot;formats&quot;:&quot;CSV:HTML:PDF:XLSX&quot;.split(&quot;:&quot;)}}},&quot;savedReports&quot;:[{&quot;id&quot;:&quot;133276016796121334&quot;,&quot;isCurrent&quot;:true,&quot;reportSettingsArea&quot;:&quot;expanded&quot;,&quot;versionNumber&quot;:2,&quot;views&quot;:{&quot;grid&quot;:{&quot;columns&quot;:[{&quot;id&quot;:&quot;133290666964118681&quot;,&quot;seq&quot;:0,&quot;columnId&quot;:&quot;132378308288755702&quot;},{&quot;id&quot;:&quot;133276704900121330&quot;,&quot;seq&quot;:1,&quot;columnId&quot;:&quot;132377622269755696&quot;},{&quot;id&quot;:&quot;133277151389121326&quot;,&quot;seq&quot;:2,&quot;columnId&quot;:&quot;132377728629755697&quot;},{&quot;id&quot;:&quot;133277679067121324&quot;,&quot;seq&quot;:3,&quot;columnId&quot;:&quot;132377830155755698&quot;},{&quot;id&quot;:&quot;133278148446121323&quot;,&quot;seq&quot;:4,&quot;columnId&quot;:&quot;132377949783755699&quot;},{&quot;id&quot;:&quot;133278690179121321&quot;,&quot;seq&quot;:5,&quot;columnId&quot;:&quot;132378104005755700&quot;},{&quot;id&quot;:&quot;133279156737121320&quot;,&quot;seq&quot;:6,&quot;columnId&quot;:&quot;132378193453755701&quot;}]}}}],&quot;data&quot;:gIg125049729068445388data});})();
(function(){apex.widget.selectList(&quot;#P19_WF_TASK_ESCALATION&quot;,{&quot;nullValue&quot;:&quot;&quot;,&quot;ajaxIdentifier&quot;:&quot;SVRFTSBUWVBFfjUxMjB-MzIzMjYwNDIwNjI1MzQ4OTQ~\u002FsHx-Qy7aanI0TV4vNFlzTB_8miVKl6JRZ4ETbZF5rNK8XIsEnG1jBIzc-A3Eb5FL9PwLx5k9ShruYA89Qk_g3g&quot;});})();
(function(){apex.widget.selectList(&quot;#P19_WF_TASK_ESCALATION_WORKFLOW&quot;,{&quot;nullValue&quot;:&quot;&quot;,&quot;ajaxIdentifier&quot;:&quot;SVRFTSBUWVBFfjUxMjB-MzIzMjY4OTYwMTA1MzQ4OTQ~\u002FYbiKcwVLQ5NuB9RT45qeoNUxfUA252MDkVZL8fT1hMv81-oQP6XU6RlEV3Gsb5S-Q_4CEXkED-wpJ6jvDFsuvw&quot;});})();
(function(){apex.widget.selectList(&quot;#C86745698992172995&quot;,{&quot;nullValue&quot;:&quot;&quot;,&quot;ajaxIdentifier&quot;:&quot;SVRFTSBUWVBFfjc5NDB-ODY3NDU2OTg5OTIxNzI5OTU~\u002FssaYkrIElNF2Wjzdv4ZRBMua_DZzAzP3qX3tvYyktuJbnzW4OxZNzLjhu3j9F73ql0l2YPN-X6bqb8xl9AK3SQ&quot;});})();
(function(){apex.widget.selectList(&quot;#C86745789596172996&quot;,{&quot;nullValue&quot;:&quot;&quot;,&quot;ajaxIdentifier&quot;:&quot;SVRFTSBUWVBFfjc5NDB-ODY3NDU3ODk1OTYxNzI5OTY~\u002F8uJ4kDONeFIhhXQmcbfsObJ4fyvX9o_7mgPWWnHqoJAxzrV1BEaQzZJO4LyibdukWY200pP7eUSsLiirC0dZNA&quot;});})();
(function(){apex.widget.selectList(&quot;#C86746066271172999&quot;,{&quot;nullValue&quot;:&quot;&quot;,&quot;ajaxIdentifier&quot;:&quot;SVRFTSBUWVBFfjc5NDB-ODY3NDYwNjYyNzExNzI5OTk~\u002F4Ny6FZSTbXIW5wojn6WvtS5S1tKrG7hZ0-zsDTgySwIkB588vUcOLDLQehrykyC2JZKd1pxeTU3byhjhf-lHDg&quot;});})();
(function(){apex.widget.selectList(&quot;#C86872618356767554&quot;,{&quot;nullValue&quot;:&quot;&quot;,&quot;ajaxIdentifier&quot;:&quot;SVRFTSBUWVBFfjc5NDB-ODY4NzI2MTgzNTY3Njc1NTQ~\u002FI61LJ2W9FX_M0IKhYMSn_hVzoAzb_ZLk3Eh-eAZzjyIxg9mvJZpaUtgeASyk6dnm2Ykuh7MlcRbxTrj6S1IWrA&quot;});})();
(function(){apex.widget.selectList(&quot;#C86874430338767572&quot;,{&quot;nullValue&quot;:&quot;&quot;,&quot;ajaxIdentifier&quot;:&quot;SVRFTSBUWVBFfjc5NDB-ODY4NzQ0MzAzMzg3Njc1NzI~\u002FzfAoO1NYy9p6l8qcq61KlScXIVq4InpAPC6cHE3puoV_W_9DtW_78g922W30i3DiUK0PBrqoVMBswp1auldO9w&quot;});})();
(function(){apex.widget.selectList(&quot;#C86874544592767573&quot;,{&quot;nullValue&quot;:&quot;&quot;,&quot;ajaxIdentifier&quot;:&quot;SVRFTSBUWVBFfjc5NDB-ODY4NzQ1NDQ1OTI3Njc1NzM~\u002F_HdqkV2dgZqlKw_8Dp1QrpyRncmAz4c6o6ye2Z_mo6a0OS1mS-2vAK2k_GTIrF_NjKzF05-7wtS6qgRzT_s1Zw&quot;});})();
(function(){var ig$=apex.jQuery('#R86745126998172990_ig');ig$.interactiveGrid({&quot;config&quot;:{&quot;columns&quot;:[{&quot;id&quot;:&quot;86746297847173001&quot;,&quot;name&quot;:&quot;APEX$ROW_ACTION&quot;,&quot;staticId&quot;:&quot;C86746297847173001&quot;,&quot;isReadOnly&quot;:false,&quot;specialType&quot;:&quot;actions&quot;},{&quot;id&quot;:&quot;86745362987172992&quot;,&quot;name&quot;:&quot;ID&quot;,&quot;staticId&quot;:&quot;C86745362987172992&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isHidden&quot;:true,&quot;isPrimaryKey&quot;:true},{&quot;id&quot;:&quot;86745505421172993&quot;,&quot;name&quot;:&quot;WF_ID&quot;,&quot;staticId&quot;:&quot;C86745505421172993&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isHidden&quot;:true,&quot;default&quot;:{&quot;value&quot;:&quot;83&quot;}},{&quot;id&quot;:&quot;86745540891172994&quot;,&quot;name&quot;:&quot;WF_TASK_ID&quot;,&quot;staticId&quot;:&quot;C86745540891172994&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isHidden&quot;:true,&quot;default&quot;:{&quot;value&quot;:&quot;201&quot;}},{&quot;id&quot;:&quot;86745698992172995&quot;,&quot;name&quot;:&quot;USERGROUP_ID&quot;,&quot;staticId&quot;:&quot;C86745698992172995&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isReadOnly&quot;:false,&quot;heading&quot;:{&quot;heading&quot;:&quot;Group&quot;,&quot;alignment&quot;:&quot;start&quot;},&quot;helpid&quot;:&quot;RC86745698992172995.0&quot;,&quot;default&quot;:{&quot;value&quot;:{&quot;v&quot;:&quot;&quot;,&quot;d&quot;:&quot;&quot;}}},{&quot;id&quot;:&quot;86745789596172996&quot;,&quot;name&quot;:&quot;NOTIFY_CREATOR&quot;,&quot;staticId&quot;:&quot;C86745789596172996&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isReadOnly&quot;:false,&quot;heading&quot;:{&quot;heading&quot;:&quot;Creator&quot;,&quot;alignment&quot;:&quot;start&quot;},&quot;default&quot;:{&quot;value&quot;:{&quot;v&quot;:&quot;0&quot;,&quot;d&quot;:&quot;0&quot;}}},{&quot;id&quot;:&quot;86746066271172999&quot;,&quot;name&quot;:&quot;IN_APP_NOTIFICATION&quot;,&quot;staticId&quot;:&quot;C86746066271172999&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isReadOnly&quot;:false,&quot;heading&quot;:{&quot;heading&quot;:&quot;In-app&quot;,&quot;alignment&quot;:&quot;start&quot;},&quot;default&quot;:{&quot;value&quot;:{&quot;v&quot;:&quot;0&quot;,&quot;d&quot;:&quot;0&quot;}}},{&quot;id&quot;:&quot;86745922709172998&quot;,&quot;name&quot;:&quot;WHERE_CLAUSE&quot;,&quot;staticId&quot;:&quot;C86745922709172998&quot;,&quot;isReadOnly&quot;:false,&quot;heading&quot;:{&quot;heading&quot;:&quot;Where Clause&quot;,&quot;alignment&quot;:&quot;start&quot;},&quot;filter&quot;:{&quot;hasLov&quot;:false},&quot;features&quot;:{&quot;sort&quot;:false,&quot;controlBreak&quot;:false,&quot;groupBy&quot;:false,&quot;aggregate&quot;:false},&quot;helpid&quot;:&quot;RC86745922709172998.0&quot;},{&quot;id&quot;:&quot;86872618356767554&quot;,&quot;name&quot;:&quot;TYPE&quot;,&quot;staticId&quot;:&quot;C86872618356767554&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isReadOnly&quot;:false,&quot;heading&quot;:{&quot;heading&quot;:&quot;Type&quot;,&quot;alignment&quot;:&quot;start&quot;},&quot;default&quot;:{&quot;value&quot;:{&quot;v&quot;:&quot;&quot;,&quot;d&quot;:&quot;&quot;}}},{&quot;id&quot;:&quot;86872805475767555&quot;,&quot;name&quot;:&quot;NOTIFICATION_MESSAGE&quot;,&quot;staticId&quot;:&quot;C86872805475767555&quot;,&quot;isReadOnly&quot;:false,&quot;heading&quot;:{&quot;heading&quot;:&quot;Message&quot;,&quot;alignment&quot;:&quot;start&quot;},&quot;filter&quot;:{&quot;hasLov&quot;:false},&quot;features&quot;:{&quot;sort&quot;:false,&quot;controlBreak&quot;:false,&quot;groupBy&quot;:false}},{&quot;id&quot;:&quot;86872883112767556&quot;,&quot;name&quot;:&quot;MAIL_SUBJECT&quot;,&quot;staticId&quot;:&quot;C86872883112767556&quot;,&quot;isReadOnly&quot;:false,&quot;heading&quot;:{&quot;heading&quot;:&quot;Mail Subject&quot;,&quot;alignment&quot;:&quot;start&quot;},&quot;filter&quot;:{&quot;hasLov&quot;:false},&quot;features&quot;:{&quot;sort&quot;:false,&quot;controlBreak&quot;:false,&quot;groupBy&quot;:false}},{&quot;id&quot;:&quot;86874430338767572&quot;,&quot;name&quot;:&quot;REROUTED&quot;,&quot;staticId&quot;:&quot;C86874430338767572&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isReadOnly&quot;:false,&quot;heading&quot;:{&quot;heading&quot;:&quot;Re-routed&quot;,&quot;alignment&quot;:&quot;start&quot;},&quot;helpid&quot;:&quot;RC86874430338767572.0&quot;,&quot;default&quot;:{&quot;value&quot;:{&quot;v&quot;:&quot;&quot;,&quot;d&quot;:&quot;&quot;}}},{&quot;id&quot;:&quot;86874544592767573&quot;,&quot;name&quot;:&quot;ROUTEBACK&quot;,&quot;staticId&quot;:&quot;C86874544592767573&quot;,&quot;dataType&quot;:&quot;NUMBER&quot;,&quot;isReadOnly&quot;:false,&quot;heading&quot;:{&quot;heading&quot;:&quot;Routeback&quot;,&quot;alignment&quot;:&quot;start&quot;},&quot;helpid&quot;:&quot;RC86874544592767573.0&quot;,&quot;default&quot;:{&quot;value&quot;:{&quot;v&quot;:&quot;&quot;,&quot;d&quot;:&quot;&quot;}}}],&quot;ajaxColumns&quot;:&quot;ODY3NDUzNjI5ODcxNzI5OTI6ODY3NDU1MDU0MjExNzI5OTM6ODY3NDU1NDA4OTEx.,NzI5OTQ6ODY3NDU2OTg5OTIxNzI5OTU6ODY3NDU3ODk1OTYxNzI5OTY6ODY3NDYw.,NjYyNzExNzI5OTk6ODY3NDU5MjI3MDkxNzI5OTg6ODY4NzI2MTgzNTY3Njc1NTQ6.,ODY4NzI4MDU0NzU3Njc1NTU6ODY4NzI4ODMxMTI3Njc1NTY6ODY4NzQ0MzAzMzg3.,Njc1NzI6ODY4NzQ1NDQ1OTI3Njc1NzM~\u002FnTpS0MdgsSpB-NhNIqRdXa5QFxUCGbbs9lIq7WTJRiMF7PsfZlLc31UUQTgifqd0xCvn5iWsnC6v5Knyh32neQ&quot;,&quot;regionId&quot;:&quot;86745126998172990&quot;,&quot;regionStaticId&quot;:&quot;R86745126998172990&quot;,&quot;ajaxIdentifier&quot;:&quot;UkVHSU9OIFRZUEV-fjg2NzQ1MTI2OTk4MTcyOTkw\u002FTijzpqD1OPfmr4XqkLeBWyVkNUW-kP2_MRIQC7lDksTx2zzOA_t3l7W2Sbp_raUIS2ppX-K4N_rmQ3vBzHvVLg&quot;,&quot;itemsToSubmit&quot;:&quot;#P19_WF_ID,#P19_WF_TASK_ID&quot;,&quot;editable&quot;:{&quot;allowedOperations&quot;:{&quot;protected&quot;:&quot;SVVE\u002FRQfXxi-xUvLbpjI1cTesle7k9p5BJtc73fJtc5I77O15jJ25ZQwfHEq1vVf-0FAXlurRLmIDAXIqMSkGqkUNTQ&quot;}},&quot;appearance&quot;:{&quot;showNullValue&quot;:&quot;-&quot;},&quot;pagination&quot;:{&quot;showTotalRowCount&quot;:true},&quot;text&quot;:{&quot;noDataFound&quot;:&quot;No notifications are configured&quot;},&quot;toolbar&quot;:false,&quot;features&quot;:{&quot;download&quot;:{&quot;downloadCs&quot;:&quot;dHJ1ZQ~~\u002FbiVCGzsqU-Ex3XORRp-nF-RW93qKr4Ruetr9gs7XgRNV4DyvymjBWIEzXl8mG9EROLXsxwaY8x6gDtABo0kpww&quot;,&quot;formats&quot;:&quot;CSV:HTML:PDF:XLSX&quot;.split(&quot;:&quot;)}}},&quot;savedReports&quot;:[{&quot;id&quot;:&quot;86852258797405317&quot;,&quot;isCurrent&quot;:true,&quot;reportSettingsArea&quot;:&quot;expanded&quot;,&quot;versionNumber&quot;:2,&quot;views&quot;:{&quot;grid&quot;:{&quot;columns&quot;:[{&quot;id&quot;:&quot;86858675596461326&quot;,&quot;seq&quot;:0,&quot;columnId&quot;:&quot;86746297847173001&quot;,&quot;isFrozen&quot;:true},{&quot;id&quot;:&quot;86852896857405324&quot;,&quot;seq&quot;:1,&quot;columnId&quot;:&quot;86745362987172992&quot;},{&quot;id&quot;:&quot;86853230799405327&quot;,&quot;seq&quot;:2,&quot;columnId&quot;:&quot;86745505421172993&quot;},{&quot;id&quot;:&quot;60478212403621235&quot;,&quot;seq&quot;:3,&quot;columnId&quot;:&quot;86872618356767554&quot;},{&quot;id&quot;:&quot;86853751268405329&quot;,&quot;seq&quot;:3,&quot;columnId&quot;:&quot;86745540891172994&quot;},{&quot;id&quot;:&quot;86854232158405330&quot;,&quot;seq&quot;:5,&quot;columnId&quot;:&quot;86745698992172995&quot;,&quot;width&quot;:184},{&quot;id&quot;:&quot;86854805132405331&quot;,&quot;seq&quot;:6,&quot;columnId&quot;:&quot;86745789596172996&quot;},{&quot;id&quot;:&quot;86855212734405332&quot;,&quot;seq&quot;:7,&quot;columnId&quot;:&quot;86745824120172997&quot;},{&quot;id&quot;:&quot;86856224200405334&quot;,&quot;seq&quot;:8,&quot;columnId&quot;:&quot;86746066271172999&quot;},{&quot;id&quot;:&quot;86855797337405333&quot;,&quot;seq&quot;:9,&quot;columnId&quot;:&quot;86745922709172998&quot;},{&quot;id&quot;:&quot;86856739792405335&quot;,&quot;seq&quot;:10,&quot;columnId&quot;:&quot;86746127040173000&quot;,&quot;width&quot;:80},{&quot;id&quot;:&quot;60480125977954953&quot;,&quot;seq&quot;:11,&quot;columnId&quot;:&quot;86872805475767555&quot;},{&quot;id&quot;:&quot;86903179755437163&quot;,&quot;seq&quot;:12,&quot;columnId&quot;:&quot;86872883112767556&quot;},{&quot;id&quot;:&quot;87682516265152356&quot;,&quot;seq&quot;:13,&quot;columnId&quot;:&quot;86874430338767572&quot;},{&quot;id&quot;:&quot;87718942574935682&quot;,&quot;seq&quot;:14,&quot;columnId&quot;:&quot;86874544592767573&quot;}]}}}],&quot;data&quot;:gIg86745126998172990data});})();
(function(){apex.jQuery('#R19357741974273844_ir').interactiveReport({&quot;regionId&quot;:&quot;R19357741974273844&quot;,&quot;toolbar&quot;:false,&quot;reportsSelect&quot;:false,&quot;maxRowCount&quot;:&quot;1000000&quot;,&quot;helpLink&quot;:&quot;wwv_flow_utilities.show_ir_help?p_app_id=100\u0026p_worksheet_id=19357898131273845\u0026p_lang=en&quot;,&quot;download&quot;:false,&quot;subscription&quot;:false,&quot;ajaxIdentifier&quot;:&quot;UkVHSU9OIFRZUEV-fjE5MzU3NzQxOTc0MjczODQ0\u002FMbHBJdkisDBYNph4EbstMmmFySEJSF8cefyY0UJJwpC2yXd9UfqgHJoMszUfPC3rTXqGI2t_9RcXYrG-0xz16A&quot;});})();
(function(){apex.da.initDaEventList();})();
(function(){apex.da.init();})();
apex.theme42.initializePage.modalDialog();

apex.page.warnOnUnsavedChanges();
} finally {
apex.event.trigger(apex.gPageContext$,'apexreadyend');
}
});
});
});


Search/html[@class=&quot;page-19 app-HALOPV800 js flexboxlegacy no-touch&quot;]/body[@class=&quot;t-Dialog-page t-Dialog-page--standard apex-side-nav apex-icons-fontapex_latest apex-theme-halo-3-0 js-dialogReady&quot;]/div[@class=&quot;a-GV-floatingItem ui-draggable is-expanded&quot;]/div[@class=&quot;a-GV-cellMoveHandle ui-draggable-handle&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;page-19 app-HALOPV800 js flexboxlegacy no-touch&quot;]/body[@class=&quot;t-Dialog-page t-Dialog-page--standard apex-side-nav apex-icons-fontapex_latest apex-theme-halo-3-0 js-dialogReady&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
   </webElementXpaths>
</WebElementEntity>

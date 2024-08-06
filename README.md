1:	To clone a repository : Create folder in the file explorer-> go to the folder click right-> Git bash here-> clone repository  with command 
	"git clone https://github.com/KrushnaKale07/Student_Info"
	
2:	Import that cloned repository in eclipse : Open eclipse-> Go to the File->import-> Maven-> Exiting Maven Projects->Next->Browse the directory where you cloned 	repository->Select 		Project Folder-> Clicked pom.xml check box -> Finish

3:	clean maven by clicking right  on Project Name-> Run As-> Maven Clean

4:	install maven by clicking right on Project Name->Run As-> Maven Install

5:	run the application by Right click on Project Name-> Run As-> spring Boot App

6:	Insert subject details using 
	url : "http://localhost:8080/details/insertSubjectsDetails" and 
	payload : 
	[
    	{
        	"subjectId": 1,
        	"subjectName": "Marathi"
    	},
    	{
        	"subjectId": 2,
        	"subjectName": "English"
    	},
    	{
        	"subjectId": 3,
        	"subjectName": "Hindi"
    	},
    	{
        	"subjectId": 4,
        	"subjectName": "History"
    	}
	]
	
7:	Insert students details using 
	url : "http://localhost:8080/details/insertStudentsDetails" and
	payload :
	{
    	"studentName": "Umesh",
    	"studentAddress": "Pimpari Nagri"
	}
	
8:	Get all students details using url : "http://localhost:8080/details/getAllStudents"

9:	Get all subjects details using url : "http://localhost:8080/details/getAllSubjects"

10:	Get Student data using url : http://localhost:8080/details/getStudentDataById/{studentId}

11:	Authinticate to generate JWT's using 
	url : "http://localhost:8080/authenticate" and 
	payload : 
	{
  		"username": "admin",
  		"password": "adminpass"
	}
	and Authorization : Bearer <jwt_token>
 
12:	I have partially completed with the security part.
	I tried my level best to execute it but I am facing some issues like bean configuration for the security part so I am not able to cover it given duration.

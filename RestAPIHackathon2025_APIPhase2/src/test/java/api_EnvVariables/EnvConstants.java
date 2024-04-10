package api_EnvVariables;

public class EnvConstants {

/*==================================File Paths==================================================================*/
	public static final String file_Path_ProgramTestdata="./src/test/resources/TestData/testdata_Program.json";
	public static final String file_Path_Schema_GetAllPrograms="./src/test/resources/TestData/Schema_GetAllPrograms.json";
	public static final String file_Path_Schema_GetAllProgramsWithUsers="./src/test/resources/TestData/Schema_GetAllProgramsWithUsers.json";
	public static final String file_Path_Schema_GetProgram="./src/test/resources/TestData/Schema_GetProgram.json";

/*==================================BaseURI & End Points=========================================================*/	
	
	public static final String qaEnvironmentbaseURI = "https://lms-marchapi-hackathon-a258d2bbd43b.herokuapp.com/lms";
	public static final String login_Endpoint = "/login";
	public static final String createProgram_Endpoint = "/saveprogram";
	public static final String getAllPrograms_Endpoint="/allPrograms";
	public static final String getAllProgramsWithUsers_Endpoint="/allProgramsWithUsers";
	public static final String getAllProgramByProgramID_Endpoint="/programs";
	public static final String deleteByProgramID_Endpoint="/deletebyprogid";
	public static final String deleteByProgramName_Endpoint="/deletebyprogname";
	
	public static final String GetAllRoles ="/roles";
	public static final String GetAllUsers ="/users";
	public static final String GetUserbyID ="/users/";
	public static final String GetAllActiveUsers ="/users/activeUsers";
	public static final String GetCountOfActiveInactive ="/users/byStatus";
	public static final String GetCountOfActiveInactiveID ="/users/byStatus/";
	public static final String GetUserByProBatch ="/users/programBatch/";
	public static final String GetUserByProg ="/users/programs/";
	public static final String GetAllUsersWithRoles ="/users/roles";
	public static final String GetUsersByFilter ="/v2/users";
	public static final String GetUserByRoleID ="/users/roles/";
	public static final String UpdateUserByUserId ="/users/";
	public static final String UpdateUserLoginStatus ="/users/userLogin/";
	public static final String UpdateUserRoleStatus ="/users/roleStatus/";
	public static final String UpdateUserRoleProgBatch ="/users/roleProgramBatchStatus/";
	public static final String UpdateUserRoleID ="/users/roleId/";
	public static final String UpdateUser ="/users/";
	public static final String CreateUsers ="/users/roleStatus";
	public static final String DeleteUser ="/users/";

/*==================================Status Code==================================================================*/
	public static final int http_OK = 200;
	public static final int http_Created = 201;
	public static final int http_BadRequest = 400;
	public static final int http_UnAuthorized = 401;
	public static final int http_NotFound = 404;
	public static final int http_ServerError = 500;
	
}

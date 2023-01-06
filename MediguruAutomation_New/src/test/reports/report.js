$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Appointments/New_Appointment.feature");
formatter.feature({
  "line": 2,
  "name": "verify sample feature to test \u0027Basic Appointment\u0027",
  "description": "",
  "id": "verify-sample-feature-to-test-\u0027basic-appointment\u0027",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 3086212800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login with sample features to test Basic Appointment",
  "description": "",
  "id": "verify-sample-feature-to-test-\u0027basic-appointment\u0027;login-with-sample-features-to-test-basic-appointment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to \u0027https://testtelehealth.mediguru.com/login\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I verify the loginpage is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I enter the username as \u0027friendsprovider\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter the password as \u0027Hello123@\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click the Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I verify the application page has been loggedin",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click the New Appointment",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I Enter Date as \"02/01/2022\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Select \"appointmentType\" as \"General\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Pick a Slot",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I Enter first name as \u0027testpatientthres\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I Enter last name as \u0027zztest\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click Mobile Number",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click India",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I Enter Mobile number as \u00278344024459\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I Enter Email id as \u0027ks17@mailinator.com\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I Enter the Reason for Visit as \u0027General Checkup\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click Create Button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I verify message as Appointment created successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I click on the schdule page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click to open the appointment details page",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I verify Appointment details page displayed",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I Click on the Resend confirmation button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I Verify message as Resend confirmation send successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I click the cancel button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I verify Pop-up screen displayed",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I Click on Confirmation yes button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I verify message displayed as Appointment Cancel successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I navigate home page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://testtelehealth.mediguru.com/login",
      "offset": 15
    }
  ],
  "location": "ProviderloginSteps.iNavigateToHttpsTesttelehealthMediguruComLogin(String)"
});
formatter.result({
  "duration": 7665729900,
  "status": "passed"
});
formatter.match({
  "location": "ProviderloginSteps.iVerifyTheLoginpageIsDisplayed()"
});
formatter.result({
  "duration": 20063848400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "friendsprovider",
      "offset": 25
    }
  ],
  "location": "ProviderloginSteps.iEnterTheUsernameAsJaddu(String)"
});
formatter.result({
  "duration": 453327100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello123@",
      "offset": 25
    }
  ],
  "location": "ProviderloginSteps.iEnterThePasswordAsHello(String)"
});
formatter.result({
  "duration": 259923400,
  "status": "passed"
});
formatter.match({
  "location": "ProviderloginSteps.iClickTheLoginButton()"
});
formatter.result({
  "duration": 2147719700,
  "status": "passed"
});
formatter.match({
  "location": "ProviderloginSteps.iVerifyTheApplicationPageHasBeenLoggedin()"
});
formatter.result({
  "duration": 11508474900,
  "status": "passed"
});
formatter.match({
  "location": "AppointmentSteps.i_click_the_New_Appointment()"
});
formatter.result({
  "duration": 20049602300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "02/01/2022",
      "offset": 17
    }
  ],
  "location": "AppointmentSteps.iEnterDateOfBirthAs(String)"
});
formatter.result({
  "duration": 20392848700,
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 20 seconds waiting for element to no longer be visible: By.cssSelector: div.spinner-grow\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027CND1384PSJ\u0027, ip: \u0027192.168.68.117\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:64048}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d108.0.5359.71 (1e0e3868ee06e91ad636a874420e3ca3ae3756ac-refs/branch-heads/5359@{#1016}), userDataDir\u003dC:\\Users\\RAJAMA~1\\AppData\\Local\\Temp\\scoped_dir14568_1211298910}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d108.0.5359.125, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: c5df5ecd704a5ed36bb1f69f2936470a\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:261)\r\n\tat TestAutomation.Pages.AppointmentPage.Enter_Date_of_Birth(AppointmentPage.java:94)\r\n\tat TestAutomation.glue.AppointmentSteps.iEnterDateOfBirthAs(AppointmentSteps.java:40)\r\n\tat ✽.And I Enter Date as \"02/01/2022\"(Appointments/New_Appointment.feature:12)\r\nCaused by: org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d108.0.5359.125)\n  (Driver info: chromedriver\u003d108.0.5359.71 (1e0e3868ee06e91ad636a874420e3ca3ae3756ac-refs/branch-heads/5359@{#1016}),platform\u003dWindows NT 10.0.22000 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 3 milliseconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027CND1384PSJ\u0027, ip: \u0027192.168.68.117\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:64048}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d108.0.5359.71 (1e0e3868ee06e91ad636a874420e3ca3ae3756ac-refs/branch-heads/5359@{#1016}), userDataDir\u003dC:\\Users\\RAJAMA~1\\AppData\\Local\\Temp\\scoped_dir14568_1211298910}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d108.0.5359.125, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: c5df5ecd704a5ed36bb1f69f2936470a\n*** Element info: {Using\u003dcss selector, value\u003ddiv.spinner-grow}\r\n\tat jdk.internal.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:492)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:899)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:41)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$20.apply(ExpectedConditions.java:584)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$20.apply(ExpectedConditions.java:580)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:238)\r\n\tat TestAutomation.Pages.AppointmentPage.Enter_Date_of_Birth(AppointmentPage.java:94)\r\n\tat TestAutomation.glue.AppointmentSteps.iEnterDateOfBirthAs(AppointmentSteps.java:40)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "appointmentType",
      "offset": 10
    },
    {
      "val": "General",
      "offset": 31
    }
  ],
  "location": "AppointmentSteps.iSelectAs(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppointmentSteps.iPickASlot()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "testpatientthres",
      "offset": 23
    }
  ],
  "location": "usernameandpasswordsteps.i_Enter_first_name_as_john(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "zztest",
      "offset": 22
    }
  ],
  "location": "usernameandpasswordsteps.i_Enter_last_name_as_peter(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "usernameandpasswordsteps.iClickMobileNumber()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "usernameandpasswordsteps.iClickIndia()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "8344024459",
      "offset": 26
    }
  ],
  "location": "usernameandpasswordsteps.iEnterMobileNumberAs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "ks17@mailinator.com",
      "offset": 21
    }
  ],
  "location": "usernameandpasswordsteps.iEnterEmailIdAsJpMailinatorCom(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "General Checkup",
      "offset": 33
    }
  ],
  "location": "AppointmentSteps.iEnterTheReasonForVisitAsGeneralCheckup(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppointmentSteps.i_click_Create_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppointmentSteps.iVerifyMessageAsAppointmentCreatedSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppointmentSteps.iClickOnTheSchdulePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppointmentSteps.iClickToOpenTheAppointmentDetailsPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppointmentSteps.iVerifyAppointmentDetailsPageDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppointmentSteps.iClickOnTheResendConfirmationButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppointmentSteps.iVerifyMessageAsResendConfirmationSendSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppointmentSteps.iClickTheCancelButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppointmentSteps.iVerifyPopUpScreenDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppointmentSteps.iClickOnConfirmationYesButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppointmentSteps.iVerifyMessageDisplayedAsAppointmentCancelSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AppointmentSteps.iNavigateHomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("login/ForgotPassword.feature");
formatter.feature({
  "line": 2,
  "name": "verify sample feature to test \u0027Forgot Password\u0027 Flow",
  "description": "",
  "id": "verify-sample-feature-to-test-\u0027forgot-password\u0027-flow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 1648664300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify the Forgot Password flow",
  "description": "",
  "id": "verify-sample-feature-to-test-\u0027forgot-password\u0027-flow;verify-the-forgot-password-flow",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I navigate to \u0027https://testtelehealth.mediguru.com/login\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I verify the loginpage is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click the Forgot username link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Enter Email id as \u0027demoprovider01@mailinator.com\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click Reset Password button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I navigate to mailinator page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I Enter id as \u0027demoprovider01@mailinator.com\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Enter Go button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify mail page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I click on Email verification mail",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I Read the verification code",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I \u0027close\u0027 the mailinator",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I Enter the verification code",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I verify Third step page displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I Enter the New password as \u0027Hello123@\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I Enter the confirm password \u0027Hello123@\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click Save Button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I verify the popup as Password Reset successfully",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://testtelehealth.mediguru.com/login",
      "offset": 15
    }
  ],
  "location": "ProviderloginSteps.iNavigateToHttpsTesttelehealthMediguruComLogin(String)"
});
formatter.result({
  "duration": 5687148800,
  "status": "passed"
});
formatter.match({
  "location": "ProviderloginSteps.iVerifyTheLoginpageIsDisplayed()"
});
formatter.result({
  "duration": 20470581800,
  "status": "passed"
});
formatter.match({
  "location": "ProviderloginSteps.iClickTheForgotUsernameLink()"
});
formatter.result({
  "duration": 3674300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demoprovider01@mailinator.com",
      "offset": 21
    }
  ],
  "location": "usernameandpasswordsteps.iEnterEmailIdAsJpMailinatorCom(String)"
});
formatter.result({
  "duration": 4588300,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d108.0.5359.125)\n  (Driver info: chromedriver\u003d108.0.5359.71 (1e0e3868ee06e91ad636a874420e3ca3ae3756ac-refs/branch-heads/5359@{#1016}),platform\u003dWindows NT 10.0.22000 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 3 milliseconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027CND1384PSJ\u0027, ip: \u0027192.168.68.117\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:55222}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d108.0.5359.71 (1e0e3868ee06e91ad636a874420e3ca3ae3756ac-refs/branch-heads/5359@{#1016}), userDataDir\u003dC:\\Users\\RAJAMA~1\\AppData\\Local\\Temp\\scoped_dir13160_353467545}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d108.0.5359.125, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 2a2299e9051baa4f1fd1fead5972d175\n*** Element info: {Using\u003dname, value\u003demail}\r\n\tat jdk.internal.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:461)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat TestAutomation.Pages.usernameandpasswordpage.Enter_Email(usernameandpasswordpage.java:24)\r\n\tat TestAutomation.glue.usernameandpasswordsteps.iEnterEmailIdAsJpMailinatorCom(usernameandpasswordsteps.java:14)\r\n\tat ✽.And I Enter Email id as \u0027demoprovider01@mailinator.com\u0027(login/ForgotPassword.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ProviderloginSteps.iClickResetPasswordButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MailinatorSteps.i_navigate_to_mailinator_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "demoprovider01@mailinator.com",
      "offset": 15
    }
  ],
  "location": "MailinatorSteps.iEnterIdAsJpMailinatorCom(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MailinatorSteps.i_Enter_Go_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MailinatorSteps.i_verify_mail_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MailinatorSteps.iClickOnEmailVerificationMail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MailinatorSteps.iReadTheVerificationCode()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "close",
      "offset": 3
    }
  ],
  "location": "MailinatorSteps.iCloseTheMailinator(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "usernameandpasswordsteps.iEnterTheVerificationCode()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "usernameandpasswordsteps.iVerifyThirdStepPageDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello123@",
      "offset": 29
    }
  ],
  "location": "ProviderloginSteps.iEnterTheNewPasswordAsHello(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello123@",
      "offset": 30
    }
  ],
  "location": "ProviderloginSteps.iEnterTheConfirmPasswordHello(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProviderloginSteps.iClickSaveButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProviderloginSteps.iVerifyThePopupAsPasswordResetSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("login/ForgotUserName.feature");
formatter.feature({
  "line": 2,
  "name": "verify sample feature to test \u0027Forgot username\u0027 Flow",
  "description": "",
  "id": "verify-sample-feature-to-test-\u0027forgot-username\u0027-flow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 1391545500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify the Forgot username flow",
  "description": "",
  "id": "verify-sample-feature-to-test-\u0027forgot-username\u0027-flow;verify-the-forgot-username-flow",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I navigate to \u0027https://testtelehealth.mediguru.com/login\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I verify the loginpage is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click the Forgot username link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Enter Email id as \u0027friendsprovider@mailinator.com\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click Get username button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify the Alert message as \u0027your username has been sent to the email\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click Return to Login",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://testtelehealth.mediguru.com/login",
      "offset": 15
    }
  ],
  "location": "ProviderloginSteps.iNavigateToHttpsTesttelehealthMediguruComLogin(String)"
});
formatter.result({
  "duration": 7747860700,
  "status": "passed"
});
formatter.match({
  "location": "ProviderloginSteps.iVerifyTheLoginpageIsDisplayed()"
});
formatter.result({
  "duration": 33542506700,
  "status": "passed"
});
formatter.match({
  "location": "ProviderloginSteps.iClickTheForgotUsernameLink()"
});
formatter.result({
  "duration": 32298321900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "friendsprovider@mailinator.com",
      "offset": 21
    }
  ],
  "location": "usernameandpasswordsteps.iEnterEmailIdAsJpMailinatorCom(String)"
});
formatter.result({
  "duration": 32354609600,
  "error_message": "org.openqa.selenium.WebDriverException: disconnected: unable to connect to renderer\n  (failed to check if window was closed: disconnected: unable to connect to renderer)\n  (Session info: chrome\u003d108.0.5359.125)\n  (Driver info: chromedriver\u003d108.0.5359.71 (1e0e3868ee06e91ad636a874420e3ca3ae3756ac-refs/branch-heads/5359@{#1016}),platform\u003dWindows NT 10.0.22000 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 32.35 seconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027CND1384PSJ\u0027, ip: \u0027192.168.68.117\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:55266}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d108.0.5359.71 (1e0e3868ee06e91ad636a874420e3ca3ae3756ac-refs/branch-heads/5359@{#1016}), userDataDir\u003dC:\\Users\\RAJAMA~1\\AppData\\Local\\Temp\\scoped_dir20384_1469566099}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d108.0.5359.125, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: dd7597184697221dfc1c731274cdc131\n*** Element info: {Using\u003dname, value\u003demail}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:461)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat TestAutomation.Pages.usernameandpasswordpage.Enter_Email(usernameandpasswordpage.java:24)\r\n\tat TestAutomation.glue.usernameandpasswordsteps.iEnterEmailIdAsJpMailinatorCom(usernameandpasswordsteps.java:14)\r\n\tat ✽.And I Enter Email id as \u0027friendsprovider@mailinator.com\u0027(login/ForgotUserName.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ProviderloginSteps.iClickGetUsernameButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "your username has been sent to the email",
      "offset": 31
    }
  ],
  "location": "ProviderloginSteps.iVerifyTheAlertMessageAsYourUsernameHasBeenSentToTheEmail(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProviderloginSteps.iClickReturnToLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("login/Loginpage.feature");
formatter.feature({
  "line": 2,
  "name": "verify sample feature to test \u0027login and logoff\u0027",
  "description": "",
  "id": "verify-sample-feature-to-test-\u0027login-and-logoff\u0027",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 1750813700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login with correct username and password",
  "description": "",
  "id": "verify-sample-feature-to-test-\u0027login-and-logoff\u0027;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to \u0027https://testtelehealth.mediguru.com/login\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I verify the loginpage is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I enter the username as \u0027leonardo\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter the password as \u0027Hello123.\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click the Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I verify the application page has been loggedin",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click profile button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I click logout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify application has been loggedoff",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://testtelehealth.mediguru.com/login",
      "offset": 15
    }
  ],
  "location": "ProviderloginSteps.iNavigateToHttpsTesttelehealthMediguruComLogin(String)"
});
formatter.result({
  "duration": 6516439700,
  "status": "passed"
});
formatter.match({
  "location": "ProviderloginSteps.iVerifyTheLoginpageIsDisplayed()"
});
formatter.result({
  "duration": 14487196300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "leonardo",
      "offset": 25
    }
  ],
  "location": "ProviderloginSteps.iEnterTheUsernameAsJaddu(String)"
});
formatter.result({
  "duration": 6930500,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d108.0.5359.125)\n  (Driver info: chromedriver\u003d108.0.5359.71 (1e0e3868ee06e91ad636a874420e3ca3ae3756ac-refs/branch-heads/5359@{#1016}),platform\u003dWindows NT 10.0.22000 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 4 milliseconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027CND1384PSJ\u0027, ip: \u0027192.168.68.117\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:63037}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d108.0.5359.71 (1e0e3868ee06e91ad636a874420e3ca3ae3756ac-refs/branch-heads/5359@{#1016}), userDataDir\u003dC:\\Users\\RAJAMA~1\\AppData\\Local\\Temp\\scoped_dir18900_581175096}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d108.0.5359.125, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 68c9d63c58411eac34669ef8de47b832\n*** Element info: {Using\u003dxpath, value\u003d//input[@type\u003d\u0027text\u0027]}\r\n\tat jdk.internal.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat TestAutomation.Pages.ProviderLoginPage.Enter_username(ProviderLoginPage.java:85)\r\n\tat TestAutomation.glue.ProviderloginSteps.iEnterTheUsernameAsJaddu(ProviderloginSteps.java:18)\r\n\tat ✽.And I enter the username as \u0027leonardo\u0027(login/Loginpage.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello123.",
      "offset": 25
    }
  ],
  "location": "ProviderloginSteps.iEnterThePasswordAsHello(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProviderloginSteps.iClickTheLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProviderloginSteps.iVerifyTheApplicationPageHasBeenLoggedin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProviderloginSteps.iClickProfileButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProviderloginSteps.iClickLogout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ProviderloginSteps.iVerifyApplicationHasBeenLoggedoff()"
});
formatter.result({
  "status": "skipped"
});
});
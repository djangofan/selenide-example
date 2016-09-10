selenide-example
=======================

## Info

Parent project at http://selenide.org/

To run, execute `gradle clean test` or `gradle build`

## Driver

Configure Chrome driver location in build.gradle as a system properties (or alternatively, 
build a factory class).  I include a Chrome driver binary in this project but you might 
need to update it.

## Report

Report .html will store a screenshot: `build/reports/tests/GoogleTest/searchForSelenideInGoogle/1473466460129.0.html`

And it will also store a regular Gradle report: `build/reports/tests/test/classes/GoogleTest.html`



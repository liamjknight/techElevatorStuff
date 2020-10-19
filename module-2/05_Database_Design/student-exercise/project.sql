/*CREATING TABLES*/

START TRANSACTION;


CREATE TABLE employee(
        id serial,
        fname varchar(25) NOT NULL,
        lname varchar(25) NOT NULL,
        job_title varchar(25) NOT NULL,
        gender char(1) NOT NULL,
        date_of_birth date NOT NULL,
        date_of_hire date NOT NULL,
        
        CONSTRAINT pk_employee PRIMARY KEY (id)
);


CREATE TABLE department(
        id serial,
        name varchar(25) NOT NULL,
        
        CONSTRAINT pk_department PRIMARY KEY (id)
);


CREATE TABLE project(
        id serial,
        name varchar(25) NOT NULL,
        start_date varchar(25) NOT NULL,
        description varchar(300) NULL,
        
        CONSTRAINT pk_project PRIMARY KEY (id)
);

        
CREATE TABLE employee_department(
        employee_id int NOT NULL,
        department_id int NOT NULL,
        
        CONSTRAINT pk_employee_department PRIMARY KEY (employee_id, department_id)
);


CREATE TABLE employee_project(
        employee_id int NOT NULL,
        project_id int NOT NULL,
        
        CONSTRAINT pk_employee_project PRIMARY KEY (employee_id, project_id)
);


/*Foreign keys*/
ALTER TABLE employee_department
ADD CONSTRAINT fk_employee_department_employee_id FOREIGN KEY (employee_id) REFERENCES employee(id);

ALTER TABLE employee_department
ADD CONSTRAINT fk_employee_department_department_id FOREIGN KEY (department_id) REFERENCES department(id);

ALTER TABLE employee_project
ADD CONSTRAINT fk_employee_project_employee_id FOREIGN KEY (employee_id) REFERENCES employee(id);

ALTER TABLE employee_project
ADD CONSTRAINT fk_employee_project_project_id FOREIGN KEY (project_id) REFERENCES project(id);


ROLLBACK;
--Having finished the project, I realized that I needed to have left all the insert lines. Shoot.
--so I ran this:
/*
SELECT * FROM employee e
INNER JOIN employee_project ep
        ON e.id = ep.employee_id
        INNER JOIN project p
                ON ep.project_id = p.id
INNER JOIN employee_department ed
        ON e.id = ed.employee_id
        INNER JOIN department d
                ON ed.department_id = d.id;
*/
--and it returned these results:
/*     e.fname e.lname  e.job_title   gender    DOB             Hire date  employ_id proj_id  p.id      project name            start date     descript   employ_id depart_id  d.id     d.name
1	Bobby	Jones	Duh Bawss	F	1969-04-01	1999-12-30	1	4	4	quarterly report	2020-01-01	(null)	       1	1	1	Administration
3	Dave	Lowh	secratant	F	1885-04-05	2002-12-02	3	4	4	quarterly report	2020-01-01	(null)	       3	1	1	Administration
2	Hound	Benson	Duh haXor	M	1985-12-11	1993-02-28	2	3	3	bug fixes	        2019-01-08	(null)	       2	3	3	Testers
4	Dianne	Strauss	fluugle worker	F	1998-05-15	2002-12-02	4	3	3	bug fixes	        2019-01-08	(null)	       4	2	2	Programmers
5	Joe	Smith	Manager	        M	1998-05-15	2001-01-01	5	2	2	search implementation	2018-08-06	(null)	       5	1	1	Administration
7	Frank	Write	sure	        M	2007-05-04	2018-07-06	7	2	2	search implementation	2018-08-06	(null)	       7	2	2	Programmers
6	Joe	Smith	Childager	M	2007-05-04	2011-11-11	6	1	1	db structuring	        2018-08-06	(null)	       6	1	1	Administration
8	Frank	Wrong	sure	        M	2007-05-04	2018-07-06	8	1	1	db structuring	        2018-08-06	(null)	       8	2	2	Programmers
*/
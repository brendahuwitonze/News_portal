# News_portal


## Database setup

* CREATE DATABASE companynews;

* \c companynews;

* CREATE TABLE departments (id serial PRIMARY KEY,name varchar, description varchar);CREATE TABLE

* CREATE TABLE employees(id serial PRIMARY KEY,name varchar, position varchar, role varchar,department_id int);

* CREATE TABLE employees_departments(id serial PRIMARY KEY,employee_id int, department_id int);

* CREATE TABLE generalnews(id serial PRIMARY KEY,title varchar, writtenby varchar, content varchar,createdat timestamp, employee_id int);

* CREATE TABLE employees_generalnews(id serial PRIMARY KEY, employee_id int,generalnews_id int);

* CREATE TABLE departmentnews(id serial PRIMARY KEY,title varchar, writtenby varchar, content varchar,createdat timestamp, employee_id int,department_id int);

* CREATE TABLE employees_departmentnews(id serial PRIMARY KEY, employee_id int,departmentnews_id int);

* CREATE TABLE departments_departmentnews(id serial PRIMARY KEY, department_id int,departmentnews_id int);


## Technologies Used

* Java
* markdown
* Handlebars
* psql


## Contact Information 

If you have any question or contributions, please email me at [ouwimpuhwe620@daviscollege.com]

## License

MIT License

Copyright (c) 2020 Odile Uwimpuhwe

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

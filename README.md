# Technical Documentation - Telephony Service Guide

## Overview

Service Guides are created using a GDS [Tech Docs Templates](https://github.com/alphagov/tech-docs-template). 
The generated HTML files are then served by a simple Scala Play application so that they can be deployed as 
an MDTP microservice.

## Getting started

Read [Tech Docs Templates][tdt] and [Documentation on using Tech Docs Templates](https://tdt-documentation.london.cloudapps.digital/#technical-documentation-template).

You will need:
* Ruby with Rubygems, perferably with a [Ruby version manager][rvm]
* [Bundler][bundler]

####Source files
Template files are located in `/source/documentation`. To add new pages simply copy and paste one of the existing pages, it will automatically appear in the menu.

####Previewing

```
bundle install
bundle exec middleman serve
```

The local URL and port where the files can be previewed will be output, this is normally http://localhost:4567.

####Building
#####To build the templates and output them to the `./public/` directory
```
bundle install
bundle exec middleman build --build-dir=public/ --clean
```

#####To build the templates and output them to the `./public/` directory and set the base path
This is only needed when the files are served through the Scala Application.

```
bundle install
BASE_PATH="/guides/telephony-service-guide/" bundle exec middleman build --build-dir=public/ --clean
```

[rvm]: https://www.ruby-lang.org/en/documentation/installation/#managers
[bundler]: http://bundler.io/
[tdt]: https://github.com/alphagov/tech-docs-template
### License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").

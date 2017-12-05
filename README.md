# riemann-log4j-appender

[![Clojars Project](https://img.shields.io/clojars/v/riemann-log4j-appender.svg)](https://clojars.org/riemann-log4j-appender)

That is a java library designed to append logs to riemann backend for futher processing.

## Configuration
Add dependency to add your project.

Add the following lines to your log4j.properties
```properties
log4j.appender.riemann = org.gorillalabs.log4jAddons.RiemannAppender
log4j.appender.riemann.localHostname = <hostname>
log4j.appender.riemann.transport = <tcp|udp>
log4j.appender.riemann.localServicename = <servicename>
log4j.appender.riemann.reconnectionDelay = 1000
```

## License

Copyright © 2017 Aleh Atsman

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

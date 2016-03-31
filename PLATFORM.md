# Platform

## Values

- **Investment:** the largest improvement of performance is going from not-working to working.
- **Complexity:** abstract is not complex or vague, it is simple but precise and correct.
- **Action:** in case of doubt, don't.

## Cluster Roles

Though not to be taken as a black and white division, the software platform can logically be thought of components in one of four functional roles, each one part of one logical cluster; one cluster operationally being responsible for one IoT isle:

- **Sensors:** software components that emmit sensor events; e.g. dedicated hardware
- **Processing:** software components that processes sensor events; e.g. cloud service.
- **Frontend:** customer facing software components, i.e. provided APIs, UIs and reporting; cloud services.

## Baseline

- **Language:**
  - Scala uniformly used by all components of all cluster roles
- **Frameworks:**
  - JDK 1.8.0: the latest 1.8 release
  - Scala 2.11.8: the latest 2.11 release
  - Akka 2.4.2: the latest stable release for Scala 2.11
  - Scala Test 2.2.6: the latest stable release for Scala 2.11
- **Realtime:**
  - Akka Persistence:
  - Cassandra 3.0.3:
- **Analytics:**
  - Spark 1.6.0:
  - Hadoop 2.7.1:

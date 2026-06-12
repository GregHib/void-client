// Marker interfaces used in ha's abstract method signatures so that ha can live in commonMain.
// The concrete JVM types (Class64, s, za, Class98, Class143, Class324) implement these
// interfaces in jvmMain and cannot themselves move to commonMain due to transitive JVM deps.

interface Class64Base
interface SBase
interface ZaBase
interface Class98Base
interface Class124Base
interface Class143Base
interface Class324Base

Equipo # 8
Integrantes: Christofer Santos Portillo Landaverde ,Bryan Alejandro Alas Delgado, Cristian Ariel Valle Claros, Bayron Alberto Lopez Zamora, Orlando Samael Menjívar Bonilla
Escenario Seleccionado: A
Solución dada al problema:
Consiste en el diseño y desarrollo de una interfaz web funcional para un Sistema de Biblioteca Universitaria, orientada a facilitar la consulta y solicitud de materiales académicos mediante una estructura limpia, atractiva y responsiva.
El sistema utiliza HTML5 semántico para organizar el catálogo en tarjetas individuales que presentan los datos clave de cada recurso (título, tipo, autor y disponibilidad), garantizando
accesibilidad y un código fácil de mantener. Su diseño visual, construido con CSS Grid, se adapta dinámicamente a cualquier pantalla (móviles, tabletas o computadoras) y emplea una
paleta de colores institucional, además de microinteracciones (hover) e indicadores de color (verde para disponible, rojo para prestado) que mejoran la experiencia de usuario. Finalmente,
la lógica en JavaScript añade interactividad al gestionar el evento de préstamo, confirmando la acción al usuario de forma clara y bloqueando la interacción en los materiales no disponibles para evitar errores.
Clase padre, clases hijas, método sobrescrito y explicación de cómo se aplica el polimorfismo:
El polimorfismo dentro del contexto de este Sistema de Biblioteca Universitaria permite definir una clase base abstracta o general (Recurso) que establece atributos comunes como
el título y la disponibilidad, mientras que las clases especializadas (Libro, Revista o Tesis) sobrescriben sus métodos principales (como solicitarPrestamo()) para ejecutar la lógica
propia de cada formato —por ejemplo, un libro puede prestarse por 15 días, una revista por 3 días para consulta rápida y una tesis solo para uso dentro de la sala—, permitiendo que el
sistema gestione todo el catálogo de forma unificada sin preocuparse por las reglas particulares de cada elemento hasta el momento de su ejecución
Función de HTML, CSS y JavaScript dentro de la solución:
En el Sistema de Biblioteca Universitaria, la arquitectura web se divide en tres tecnologías clave: HTML define la estructura y el contenido semántico organizando los recursos (libros,
revistas) en tarjetas; CSS proporciona la presentación visual y el diseño adaptativo mediante un sistema de cuadrícula (Grid), aplicando colores según el estado de disponibilidad e
interacciones al pasar el cursor; y JavaScript aporta la interactividad capturando las acciones del usuario (como el clic para solicitar préstamo) para validar la disponibilidad y mostrar confirmaciones en pantalla
División de Responsabilidades entre Frontend y Backend:
La solución separa claramente la experiencia visual del procesamiento de datos. El frontend asume la responsabilidad del cliente: renderizar la interfaz visual, mostrar las tarjetas del
catálogo y ofrecer una respuesta inmediata a los eventos del usuario. Por su parte, el backend se encarga de la lógica profunda en el servidor: consultar y actualizar el inventario en la base de
datos, verificar que el usuario esté autenticado y sin sanciones, y procesar formalmente el registro y la notificación del préstamo.

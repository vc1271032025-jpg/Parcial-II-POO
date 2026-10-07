class MaterialBiblioteca:
    def __init__(self, titulo, codigo, disponibilidad=True):
        self.titulo = titulo
        self.codigo = codigo
        self.disponibilidad = disponibilidad

    def mostrar_informacion(self):
        estado = "Disponible" if self.disponibilidad else "Prestado"
        print(f"Título: {self.titulo} | Código: {self.codigo} | Estado: {estado}")
        
    def calcular_dias_prestamo(self):
        pass

class Libro(MaterialBiblioteca):
    def __init__(self, titulo, codigo, autor, disponibilidad=True):
        super().__init__(titulo, codigo, disponibilidad)
        self.autor = autor

    def mostrar_informacion(self):
        estado = "Disponible" if self.disponibilidad else "Prestado"
        print(f"[Libro] Título: {self.titulo} | Autor: {self.autor} | Código: {self.codigo} | Estado: {estado}")

    def calcular_dias_prestamo(self):
        return 7

class Revista(MaterialBiblioteca):
    def __init__(self, titulo, codigo, numero_edicion, disponibilidad=True):
        super().__init__(titulo, codigo, disponibilidad)
        self.numero_edicion = numero_edicion

    def mostrar_informacion(self):
        estado = "Disponible" if self.disponibilidad else "Prestado"
        print(f"[Revista] Título: {self.titulo} | Edición: {self.numero_edicion} | Código: {self.codigo} | Estado: {estado}")

    def calcular_dias_prestamo(self):
        return 3

# Crear al menos dos libros y dos revistas
libro1 = Libro("El nombre de la rosa", "L-001", "Umberto Eco")
libro2 = Libro("Ficciones", "L-002", "Jorge Luis Borges")
revista1 = Revista("National Geographic", "R-001", 205)
revista2 = Revista("Science", "R-002", 5890)

# Almacenarlos en una misma colección
coleccion_biblioteca = [libro1, libro2, revista1, revista2]

# Recorrer la colección utilizando polimorfismo
for material in coleccion_biblioteca:
    material.mostrar_informacion()
    print(f"Días de préstamo permitidos: {material.calcular_dias_prestamo()} días")
    print("-" * 50)
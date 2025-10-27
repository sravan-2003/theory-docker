FROM openjdk:17

WORKDIR /app

# Create folder structure inside the container
RUN mkdir -p adda/project/theory

# Copy all Java source files into container
COPY Main.java adda/project/theory/
COPY Passenger.java adda/project/theory/
COPY Payment.java adda/project/theory/
COPY RailwayDatabase.java adda/project/theory/
COPY Ticket.java adda/project/theory/
COPY TicketClerk.java adda/project/theory/
COPY Train.java adda/project/theory/

# Compile all Java files
RUN javac adda/project/theory/*.java

# Command to run your main class
CMD ["java", "adda.project.theory.Main", "RailwayDB", "3306"]
EXPOSE 8080


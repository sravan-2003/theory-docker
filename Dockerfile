# Use OpenJDK 17 as base
FROM openjdk:17

# Set working directory
WORKDIR /app

# Create directory structure
RUN mkdir -p adda/project/theory

# Copy all Java files into container
COPY Main.java adda/project/theory/
COPY Passenger.java adda/project/theory/
COPY Payment.java adda/project/theory/
COPY RailwayDatabase.java adda/project/theory/
COPY Ticket.java adda/project/theory/
COPY TicketClerk.java adda/project/theory/
COPY Train.java adda/project/theory/

# Compile all Java files
RUN javac adda/project/theory/*.java

# Automatically run your main class
CMD ["java", "adda.project.theory.Main"]



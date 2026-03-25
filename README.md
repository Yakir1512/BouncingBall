# 🎮 Bouncing Ball

> A fun and interactive Java game featuring physics simulation, collision detection, and paddle mechanics!

---

## 🎯 Overview

**Bouncing Ball** is a classic breakout-style game implemented in pure Java. Watch as a bouncing ball collides with blocks and walls in a dynamic game environment powered by realistic physics simulation.

### ✨ Key Features

- 🎪 **Ball Physics**: Realistic movement and velocity calculations
- 🧩 **Collision Detection**: Advanced collision system between balls, blocks, and walls
- 🏏 **Paddle Control**: Interactive paddle (Padle) for ball management
- 🧱 **Block Breaking**: Destroy blocks and rack up points!
- 🌍 **Game Environment**: Complete game world with physics simulation
- 📐 **Geometric Primitives**: Point, Line, Rectangle, and Movement classes for spatial calculations

---

## 🗂️ Project Structure

```
BouncingBall/
├── src/
│   ├── Ball.java              # The bouncing ball entity
│   ├── Block.java             # Destructible game blocks
│   ├── Collidable.java        # Interface for collidable objects
│   ├── CollisionInfo.java     # Collision information and details
│   ├── GameEnvironment.java   # Main game world and physics engine
│   ├── Line.java              # Line segment geometry
│   ├── Main.java              # Game entry point
│   ├── Movement.java          # Movement and velocity system
│   ├── Padle.java             # Player-controlled paddle
│   ├── Point.java             # 2D point representation
│   ├── Rectangle.java         # Rectangle geometry for collision bounds
│   ├── Velocity.java          # Velocity vector class
│   └── Wall.java              # Game boundaries and walls
├── BouncingBall.iml           # IntelliJ IDEA project file
└── README.md                   # This file!
```

---

## 🛠️ Core Components

### 🎲 Physics & Geometry
- **Point**: 2D coordinate representation
- **Line**: Line segment calculations
- **Rectangle**: Bounding box geometry
- **Velocity**: Vector-based movement system
- **Movement**: Entity movement handling

### 🎮 Game Entities
- **Ball**: Main game object with physics
- **Block**: Breakable obstacles
- **Wall**: Static boundaries
- **Padle**: Player-controlled paddle

### ⚙️ System Classes
- **Collidable**: Interface for objects that can collide
- **CollisionInfo**: Encapsulates collision data and results
- **GameEnvironment**: Orchestrates physics, collisions, and game logic
- **Main**: Application entry point

---

## 🚀 Getting Started

### Prerequisites
- ☕ Java 8 or higher
- 🖥️ Any IDE (IntelliJ IDEA, Eclipse, VS Code with Java extensions)

### Running the Game

1. **Open the project** in your favorite IDE
2. **Locate** `src/Main.java`
3. **Run** the `main()` method
4. 🎮 **Enjoy!** Control the paddle and bounce the ball!

---

## 🎓 What You'll Learn

This project demonstrates:
- 📦 **Object-Oriented Design**: Classes, interfaces, and inheritance
- 🧮 **Collision Detection Algorithms**: Computing intersection points and normals
- 📐 **Geometric Computations**: Working with 2D shapes and vectors
- 🎬 **Game Loop Concepts**: Physics updates and frame-based rendering
- 🔄 **Event-Driven Programming**: Handling collisions and state changes

---

## 📝 Notes

- This is a learning project focused on **game physics and collision detection**
- The code emphasizes **clean architecture** and **geometric accuracy**
- Perfect for understanding **fundamental game development concepts**

---

## 💡 Future Enhancements

- 🎨 Add graphics rendering (Java Swing/JavaFX)
- 🔊 Sound effects for collisions
- 📊 Score tracking system
- ⭐ Power-ups and special effects
- 🎯 Different difficulty levels
- 🏆 Leaderboard functionality

---

## 👨‍💻 Author

Created by **Yakir1512**

---

## 📄 License

This project is open source and available on GitHub.

---

<div align="center">

### 🌟 Happy Bouncing! 🌟

*May your collisions be accurate and your paddle swift!*

</div>
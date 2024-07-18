# VillagerAbuseSystem
### Overview

VillagerAbuseSystem is a Minecraft plugin designed to prevent players from exploiting the villager re-roll mechanic. Once a villager acquires a profession, they retain it even if their workstation is removed and replaced. This ensures a more balanced and fair gameplay experience by stopping players from continuously changing villager trades to obtain the best possible deals.

### Features

* Villagers retain their profession once acquired. 
* Prevents changing villager trades by removing and replacing workstations.
* Simple and efficient implementation to enhance gameplay fairness.

### Installation

    Download the latest version of the plugin from the releases page.
    Copy the VillagerAbuseSystem.jar file to your Minecraft server's plugins directory.
    Restart your server to load the plugin.

### Usage

Once installed, the plugin will automatically ensure that villagers retain their profession. No additional configuration is required.

### Example

When a player interacts with a villager and the villager acquires a profession, removing and replacing the villager's workstation will no longer cause the villager to change their profession. This mechanic helps maintain a consistent and fair trading system within the game.
### Development
#### Prerequisites

    Java Development Kit (JDK) 8 or higher
    Maven or Gradle (for building the plugin)
    Minecraft server with Spigot/Bukkit API

#### Building from Source

  1. Clone the repository:


    git clone https://github.com/yourusername/VillagerAbuseSystem.git
    cd VillagerAbuseSystem

  2. Build the plugin using Maven or Gradle:

    mvn package
    # or
    gradle build

  3. The compiled .jar file will be located in the target or build/libs directory.

### Contributing

  Fork the repository.
  Create your feature branch (git checkout -b feature/Feature).
  Commit your changes (git commit -m 'Your contribution resume').
  Push to the branch (git push origin feature/Feature).
  Open a pull request.

### License

This project is licensed under the MIT License. See the LICENSE file for details.
### Contact

For any questions or issues, please open an issue on the GitHub repository.

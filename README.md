# Minecraft Modpack

Frostfire Realms is a Forge 1.20.1 Minecraft modpack starter focused on ice, fire, dragons, exploration, structures, biomes, multiplayer, performance, and survival quality of life. It includes a server-friendly companion mod with an `/icebound` verification command, plus a categorized manifest for assembling the compatible third-party mods.

## Install

1. Install Minecraft Java Edition 1.20.1.
2. Install Java 17.
3. Install Minecraft Forge 47.2.0 for Minecraft 1.20.1.
4. Create a Forge 1.20.1 profile using a launcher that supports Forge modpacks, such as Prism Launcher or CurseForge.
5. Open `modpack/manifest.json`.
6. Download the compatible Minecraft 1.20.1 Forge files for the listed mods and their dependencies.
7. Add all `requiredOnServer` mods to the client profile and dedicated server.
8. Add `recommendedOnClientAndServer` mods to both the client profile and server if you want those features.
9. Add `clientOnly` mods only to player profiles. Do not install them on a dedicated server.
10. Build this project's companion mod with `./gradlew build` or `gradlew.bat build`.
11. Copy `build/libs/icebound-essentials-1.0.0.jar` to the `mods` folder on the server and every client.

Use compatible files for Minecraft 1.20.1 and Forge 47.x only. Do not install Fabric, NeoForge, other Minecraft versions, or duplicate dependency jars.

## Use

### Dedicated server

1. Install a Minecraft Forge 1.20.1 server using Forge 47.2.0 and Java 17.
2. Start the server once, accept the EULA in `eula.txt`, and stop the server.
3. Copy the required gameplay mods, their dependencies, and the companion mod into the server's `mods` folder.
4. Copy `server.properties.example` to the server directory and rename it to `server.properties`.
5. Review the server settings, whitelist entries, and network settings for your hosting environment.
6. Start the server.
7. Install the same Minecraft version, Forge version, gameplay mods, companion mod, and shared configurations on every player client.
8. Create or select a world after choosing the intended world-generation mods. Back up the world before changing world-generation mods.

Simple Voice Chat requires its server-side mod and a permitted UDP voice port. Voice chat is optional and does not affect ordinary multiplayer connections.

### Companion command

Run `/icebound` in-game or from a server with permission to use commands. The command confirms that the Frostfire Realms companion mod is installed.

### Mod categories

The manifest includes Ice and Fire: Community Edition, Citadel, additional biomes, villages, dungeons, strongholds, Waystones, JEI, proximity voice chat, backpacks, artifacts, wildlife, performance tools, minimaps, optional shaders, automation, building utilities, and storage expansions. The manifest identifies which entries belong on the server, on both sides, or only on clients.

---

More Minecraft mod projects by EnderDevelopment: https://github.com/EnderDevelopment

Project page: https://dash.enderdevelopment.com/community/e9588dd5-d560-4d89-a2f0-c47d285fbe4b?utm_source=github&utm_medium=readme&utm_campaign=auto_publish&utm_content=e9588dd5-d560-4d89-a2f0-c47d285fbe4b

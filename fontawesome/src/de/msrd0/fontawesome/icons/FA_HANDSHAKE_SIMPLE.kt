/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_HANDSHAKE_SIMPLE: Icon {
	
	override val name get() = "Handshake simple"
	
	override val unicode get() = "f4c6"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M334.6 217.4l-30 27.49C264 282.1 217.8 256.8 202.9 240.6C176 211.2 178.1 165.7 207.3 138.9L289.1 64H282.5C224.7 64 169.1 86.95 128.2 127.8L32 128.1c-17.6 0-32 14.39-32 31.98v159.8c0 17.59 14.4 32.04 31.1 32.04l114.3-.0604l90.5 81.82c27.5 22.37 67.75 18.11 90-9.255l18.12 15.25c15.88 12.1 39.38 10.5 52.38-5.369l31.38-38.6l5.374 4.498c13.75 11 33.88 9.002 45-4.748l9.576-11.83c11.08-13.7 8.979-33.75-4.701-44.86L334.6 217.4zM608 128.1l-96-.1257c-40.98-40.96-96.56-63.88-154.5-63.88L348.9 64c-8 0-15.62 3.197-21.62 8.568L229 162.3C228.9 162.5 228.8 162.7 228.8 162.7C212 178.5 212.4 203.3 226.6 218.7c9.625 10.5 35 21.62 56.13 2.75c0-.125 .25-.125 .375-.25l80-73.1c6.5-5.871 16.62-5.496 22.62 1s5.5 16.62-1 22.62l-26.12 23.87l145.6 118.1c12.12 9.992 19.5 23.49 22.12 37.98L608 351.7c17.6 0 32-14.38 32-31.98V160.1C640 142.4 625.7 128.1 608 128.1z"/></svg>"""
		else -> null
	}
	
}

val FA_HANDSHAKE_ALT = FA_HANDSHAKE_SIMPLE

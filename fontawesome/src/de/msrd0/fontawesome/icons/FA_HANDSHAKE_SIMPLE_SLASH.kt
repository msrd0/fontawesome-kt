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

object FA_HANDSHAKE_SIMPLE_SLASH: Icon {
	
	override val name get() = "Handshake simple slash"
	
	override val unicode get() = "e05f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M358.6 195.6l145.6 118.1c12.12 9.992 19.5 23.49 22.12 37.98h81.62c17.6 0 31.1-14.39 31.1-31.99V159.1c0-17.67-14.33-31.99-31.1-31.99h-95.1c-40.98-40.96-96.56-63.98-154.5-63.98h-8.613c-7.1 0-15.63 3.002-21.63 8.373l-93.44 85.57L208.3 137.9L289.1 64.01L282.5 64c-43.48 0-85.19 13.66-120.8 37.44l-122.9-96.33C34.41 1.672 29.19 0 24.03 0c-7.125 0-14.19 3.156-18.91 9.187c-8.187 10.44-6.375 25.53 4.062 33.7L601.2 506.9c10.5 8.203 25.56 6.328 33.69-4.078c8.187-10.44 6.375-25.53-4.062-33.7l-135.5-106.2c-.1719-9.086-3.789-18.03-11.39-24.2l-149.2-121.2l-11.47 10.51L297.6 207.1l65.51-59.85c6.5-5.871 16.62-5.496 22.62 .1c5.1 6.496 5.5 16.62-.1 22.62L358.6 195.6zM32 127.1c-17.6 0-31.1 14.4-31.1 31.99v159.8c0 17.59 14.4 32.06 31.1 32.06l114.2-.0712l90.5 81.85c27.5 22.37 67.75 18.12 89.1-9.25l18.12 15.25c15.87 12.1 39.37 10.5 52.37-5.371l13.02-16.03L39.93 127.1L32 127.1z"/></svg>"""
		else -> null
	}
	
}

val FA_HANDSHAKE_ALT_SLASH = FA_HANDSHAKE_SIMPLE_SLASH

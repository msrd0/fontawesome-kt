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

object FA_ANKH: Icon {
	
	override val name get() = "Ankh"
	
	override val unicode get() = "f644"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M296 256h-44.63C272.5 222 288 181.6 288 144C288 55.62 230.8 0 160 0S32 55.62 32 144C32 181.6 47.5 222 68.63 256H24C10.75 256 0 266.8 0 280v32c0 13.25 10.75 24 24 24h96v152C120 501.2 130.8 512 144 512h32c13.25 0 24-10.75 24-24V336h96c13.25 0 24-10.75 24-24v-32C320 266.8 309.2 256 296 256zM160 80c29.62 0 48 24.5 48 64c0 34.62-27.12 78.12-48 100.9C139.1 222.1 112 178.6 112 144C112 104.5 130.4 80 160 80z"/></svg>"""
		else -> null
	}
	
}

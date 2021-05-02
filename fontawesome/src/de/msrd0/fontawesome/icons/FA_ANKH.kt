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
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M296 256h-44.62C272.46 222.01 288 181.65 288 144 288 55.63 230.69 0 160 0S32 55.63 32 144c0 37.65 15.54 78.01 36.62 112H24c-13.25 0-24 10.74-24 24v32c0 13.25 10.75 24 24 24h96v152c0 13.25 10.75 24 24 24h32c13.25 0 24-10.75 24-24V336h96c13.25 0 24-10.75 24-24v-32c0-13.26-10.75-24-24-24zM160 80c29.61 0 48 24.52 48 64 0 34.66-27.14 78.14-48 100.87-20.86-22.72-48-66.21-48-100.87 0-39.48 18.39-64 48-64z"/></svg>"""
		else -> null
	}
	
}

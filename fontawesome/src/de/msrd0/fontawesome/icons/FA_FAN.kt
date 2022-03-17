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

/** Fan */
object FA_FAN: Icon {
	
	override val name get() = "Fan"
	
	override val unicode get() = "f863"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M352.6 127.1c-28.12 0-54.13 4.5-77.13 12.88l12.38-123.1c1.125-10.5-8.125-18.88-18.5-17.63C189.6 10.12 127.1 77.62 127.1 159.4c0 28.12 4.5 54.13 12.88 77.13L17.75 224.1c-10.5-1.125-18.88 8.125-17.63 18.5c9.1 79.75 77.5 141.4 159.3 141.4c28.12 0 54.13-4.5 77.13-12.88l-12.38 123.1c-1.125 10.38 8.125 18.88 18.5 17.63c79.75-10 141.4-77.5 141.4-159.3c0-28.12-4.5-54.13-12.88-77.13l123.1 12.38c10.5 1.125 18.88-8.125 17.63-18.5C501.9 189.6 434.4 127.1 352.6 127.1zM255.1 287.1c-17.62 0-31.1-14.38-31.1-32s14.37-32 31.1-32s31.1 14.38 31.1 32S273.6 287.1 255.1 287.1z"/></svg>"""
		else -> null
	}
	
}

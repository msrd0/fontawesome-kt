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

/** Less Than Equal To */
object FA_LESS_THAN_EQUAL: Icon {
	
	override val name get() = "Less Than Equal To"
	
	override val unicode get() = "f537"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M52.11 221.7l320 128C376 351.3 380 352 383.1 352c12.7 0 24.72-7.594 29.73-20.12c6.562-16.41-1.422-35.03-17.83-41.59L150.2 192l245.7-98.28c16.41-6.562 24.39-25.19 17.83-41.59S388.6 27.68 372.1 34.21l-320 128.1C39.97 167.2 32 178.9 32 192S39.97 216.8 52.11 221.7zM416 416H32c-17.67 0-32 14.31-32 31.1S14.33 480 32 480h384c17.67 0 32-14.31 32-32S433.7 416 416 416z"/></svg>"""
		else -> null
	}
	
}

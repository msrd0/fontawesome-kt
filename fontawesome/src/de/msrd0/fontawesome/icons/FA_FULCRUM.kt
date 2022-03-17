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
import de.msrd0.fontawesome.Style.BRANDS

/** Fulcrum */
object FA_FULCRUM: Icon {
	
	override val name get() = "Fulcrum"
	
	override val unicode get() = "f50b"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M95.75 164.14l-35.38 43.55L25 164.14l35.38-43.55zM144.23 0l-20.54 198.18L72.72 256l51 57.82L144.23 512V300.89L103.15 256l41.08-44.89zm79.67 164.14l35.38 43.55 35.38-43.55-35.38-43.55zm-48.48 47L216.5 256l-41.08 44.89V512L196 313.82 247 256l-51-57.82L175.42 0z"/></svg>"""
		else -> null
	}
	
}

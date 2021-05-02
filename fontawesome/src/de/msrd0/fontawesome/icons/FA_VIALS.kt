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

object FA_VIALS: Icon {
	
	override val name get() = "Vials"
	
	override val unicode get() = "f493"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M72 64h24v240c0 44.1 35.9 80 80 80s80-35.9 80-80V64h24c4.4 0 8-3.6 8-8V8c0-4.4-3.6-8-8-8H72c-4.4 0-8 3.6-8 8v48c0 4.4 3.6 8 8 8zm72 0h64v96h-64V64zm480 384H16c-8.8 0-16 7.2-16 16v32c0 8.8 7.2 16 16 16h608c8.8 0 16-7.2 16-16v-32c0-8.8-7.2-16-16-16zM360 64h24v240c0 44.1 35.9 80 80 80s80-35.9 80-80V64h24c4.4 0 8-3.6 8-8V8c0-4.4-3.6-8-8-8H360c-4.4 0-8 3.6-8 8v48c0 4.4 3.6 8 8 8zm72 0h64v96h-64V64z"/></svg>"""
		else -> null
	}
	
}

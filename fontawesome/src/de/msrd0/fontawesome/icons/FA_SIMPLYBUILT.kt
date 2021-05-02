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

object FA_SIMPLYBUILT: Icon {
	
	override val name get() = "SimplyBuilt"
	
	override val unicode get() = "f215"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M481.2 64h-106c-14.5 0-26.6 11.8-26.6 26.3v39.6H163.3V90.3c0-14.5-12-26.3-26.6-26.3h-106C16.1 64 4.3 75.8 4.3 90.3v331.4c0 14.5 11.8 26.3 26.6 26.3h450.4c14.8 0 26.6-11.8 26.6-26.3V90.3c-.2-14.5-12-26.3-26.7-26.3zM149.8 355.8c-36.6 0-66.4-29.7-66.4-66.4 0-36.9 29.7-66.6 66.4-66.6 36.9 0 66.6 29.7 66.6 66.6 0 36.7-29.7 66.4-66.6 66.4zm212.4 0c-36.9 0-66.6-29.7-66.6-66.6 0-36.6 29.7-66.4 66.6-66.4 36.6 0 66.4 29.7 66.4 66.4 0 36.9-29.8 66.6-66.4 66.6z"/></svg>"""
		else -> null
	}
	
}

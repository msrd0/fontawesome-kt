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

/** ORCID */
object FA_ORCID: Icon {
	
	override val name get() = "ORCID"
	
	override val unicode get() = "f8d2"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M294.75 188.19h-45.92V342h47.47c67.62 0 83.12-51.34 83.12-76.91 0-41.64-26.54-76.9-84.67-76.9zM256 8C119 8 8 119 8 256s111 248 248 248 248-111 248-248S393 8 256 8zm-80.79 360.76h-29.84v-207.5h29.84zm-14.92-231.14a19.57 19.57 0 1 1 19.57-19.57 19.64 19.64 0 0 1-19.57 19.57zM300 369h-81V161.26h80.6c76.73 0 110.44 54.83 110.44 103.85C410 318.39 368.38 369 300 369z"/></svg>"""
		else -> null
	}
	
}

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

object FA_SIM_CARD: Icon {
	
	override val name get() = "SIM Card"
	
	override val unicode get() = "f7c4"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M0 64v384c0 35.3 28.7 64 64 64h256c35.3 0 64-28.7 64-64V128L256 0H64C28.7 0 0 28.7 0 64zm224 192h-64v-64h64v64zm96 0h-64v-64h32c17.7 0 32 14.3 32 32v32zm-64 128h64v32c0 17.7-14.3 32-32 32h-32v-64zm-96 0h64v64h-64v-64zm-96 0h64v64H96c-17.7 0-32-14.3-32-32v-32zm0-96h256v64H64v-64zm0-64c0-17.7 14.3-32 32-32h32v64H64v-32z"/></svg>"""
		else -> null
	}
	
}

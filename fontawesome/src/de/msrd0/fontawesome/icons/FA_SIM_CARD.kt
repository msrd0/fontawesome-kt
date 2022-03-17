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
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M0 64v384c0 35.25 28.75 64 64 64h256c35.25 0 64-28.75 64-64V128l-128-128H64C28.75 0 0 28.75 0 64zM224 256H160V192h64V256zM320 256h-64V192h32c17.75 0 32 14.25 32 32V256zM256 384h64v32c0 17.75-14.25 32-32 32h-32V384zM160 384h64v64H160V384zM64 384h64v64H96c-17.75 0-32-14.25-32-32V384zM64 288h256v64H64V288zM64 224c0-17.75 14.25-32 32-32h32v64H64V224z"/></svg>"""
		else -> null
	}
	
}
